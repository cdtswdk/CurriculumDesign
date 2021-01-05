package org.mybatis.generator.plugins;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.*;

import javax.annotation.Generated;
import java.util.List;

public class MobyyPlugin extends PluginAdapter {


    private static void addGeneratedAnnotation(Interface unit, IntrospectedTable table) {
        unit.addImportedType(new FullyQualifiedJavaType(Generated.class.getName()));
        unit.addAnnotation(String.format("@Generated(\"%s\")", table.getTableConfiguration().getTableName()));
    }

    private static void addGeneratedAnnotation(TopLevelClass unit, IntrospectedTable table) {
        unit.addImportedType(new FullyQualifiedJavaType(Generated.class.getName()));
        unit.addAnnotation(String.format("@Generated(\"%s\")", table.getTableConfiguration().getTableName()));
    }

    @Override
    public boolean validate(List<String> warnings) {
        return true;
    }

    @Override
    public boolean modelExampleClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {

        Method instance = new Method("instance");
        instance.setReturnType(topLevelClass.getType());
        instance.setStatic(true);
        instance.setVisibility(JavaVisibility.PUBLIC);
        instance.addBodyLine(String.format("return new %s();", topLevelClass.getType().getShortNameWithoutTypeArguments()));


        topLevelClass.addMethod(instance);

        topLevelClass.getMethods().stream().filter(
                method -> method.getName().equals("setOrderByClause")
        ).findAny().ifPresent(
                method ->
                {
                    method.setReturnType(topLevelClass.getType());
                    method.addBodyLine("return this;");
                }
        );

        topLevelClass.getInnerClasses().stream().filter(innerClass -> innerClass.getType().getFullyQualifiedName().equals(
                "Criteria"
        )).findAny().ifPresent(
                innerClass -> {
                    Field field = new Field("example", topLevelClass.getType());
                    field.setVisibility(JavaVisibility.PRIVATE);
                    innerClass.addField(field);
                    Method method = new Method("example");
                    method.setReturnType(topLevelClass.getType());
                    method.setVisibility(JavaVisibility.PUBLIC);
                    method.addBodyLine("return this.example;");
                    innerClass.addMethod(method);
                }
        );

        topLevelClass.getMethods().stream().filter(
                method -> method.getName().equals("createCriteria")
        ).findAny().ifPresent(
                method -> method.addBodyLine(1, "criteria.example = this;")
        );


        addGeneratedAnnotation(topLevelClass, introspectedTable);

        paging(topLevelClass);

        limitOffset(topLevelClass);

        return true;
    }

    @Override
    public boolean providerSelectByExampleWithBLOBsMethodGenerated(Method method, TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        addPaging(method);
        return true;
    }

    @Override
    public boolean providerSelectByExampleWithoutBLOBsMethodGenerated(Method method, TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        addPaging(method);
        return true;
    }

    private void addPaging(Method method) {
        int index = method.getBodyLines().size() - 1;
        method.addBodyLine(index++, "if (example != null && example.getLimit() != null) {");
        method.addBodyLine(index++, "sql.LIMIT(example.getLimit());");
        method.addBodyLine(index++, "}");
        method.addBodyLine(index++, "if (example != null && example.getOffset() != null) {");
        method.addBodyLine(index++, "sql.OFFSET(example.getOffset());");
        method.addBodyLine(index++, "}");
        method.addBodyLine(index++, "if (example != null && example.getPageNum() != null && example.getPageSize() != null) {");
        method.addBodyLine(index++, "sql.LIMIT(example.getPageSize());");
        method.addBodyLine(index++, "sql.OFFSET((example.getPageNum() - 1) * example.getPageSize());");
        method.addBodyLine(index, "}");
    }

    private void limitOffset(TopLevelClass topLevelClass) {
        PrimitiveTypeWrapper integerWrapper = FullyQualifiedJavaType.getIntInstance().getPrimitiveTypeWrapper();

        Field limit = new Field("limit", integerWrapper);
        limit.setVisibility(JavaVisibility.PRIVATE);
        topLevelClass.addField(limit);

        Field offset = new Field("offset", integerWrapper);
        offset.setVisibility(JavaVisibility.PRIVATE);
        topLevelClass.addField(offset);

        Method setLimit = new Method("setLimit");
        setLimit.setVisibility(JavaVisibility.PUBLIC);
        setLimit.addParameter(new Parameter(integerWrapper, "limit"));
        setLimit.addBodyLine("this.limit = limit;");
        setLimit.addBodyLine("return this;");
        setLimit.setReturnType(topLevelClass.getType());
        topLevelClass.addMethod(setLimit);

        Method setOffset = new Method("setOffset");
        setOffset.setVisibility(JavaVisibility.PUBLIC);
        setOffset.addParameter(new Parameter(integerWrapper, "offset"));
        setOffset.addBodyLine("this.offset = offset;");
        setOffset.addBodyLine("return this;");
        setOffset.setReturnType(topLevelClass.getType());
        topLevelClass.addMethod(setOffset);

        Method getLimit = new Method("getLimit");
        getLimit.setVisibility(JavaVisibility.PUBLIC);
        getLimit.setReturnType(integerWrapper);
        getLimit.addBodyLine("return limit;");
        topLevelClass.addMethod(getLimit);

        Method getOffset = new Method("getOffset");
        getOffset.setVisibility(JavaVisibility.PUBLIC);
        getOffset.setReturnType(integerWrapper);
        getOffset.addBodyLine("return offset;");
        topLevelClass.addMethod(getOffset);
    }

    private void paging(TopLevelClass topLevelClass) {
        PrimitiveTypeWrapper integerWrapper = FullyQualifiedJavaType.getIntInstance().getPrimitiveTypeWrapper();

        Field pageNum = new Field("pageNum", integerWrapper);
        pageNum.setVisibility(JavaVisibility.PRIVATE);
        topLevelClass.addField(pageNum);

        Field pageSize = new Field("pageSize", integerWrapper);
        pageSize.setVisibility(JavaVisibility.PRIVATE);
        topLevelClass.addField(pageSize);

        Method setPageNum = new Method("paging");
        setPageNum.setVisibility(JavaVisibility.PUBLIC);
        setPageNum.addParameter(new Parameter(integerWrapper, "pageNum"));
        setPageNum.addParameter(new Parameter(integerWrapper, "pageSize"));
        setPageNum.addBodyLine("this.pageNum = pageNum;this.pageSize = pageSize;");
        setPageNum.addBodyLine("return this;");
        setPageNum.setReturnType(topLevelClass.getType());
        topLevelClass.addMethod(setPageNum);

        Method getPageNum = new Method("getPageNum");
        getPageNum.setVisibility(JavaVisibility.PUBLIC);
        getPageNum.setReturnType(integerWrapper);
        getPageNum.addBodyLine("return pageNum;");
        topLevelClass.addMethod(getPageNum);

        Method getPageSize = new Method("getPageSize");
        getPageSize.setVisibility(JavaVisibility.PUBLIC);
        getPageSize.setReturnType(integerWrapper);
        getPageSize.addBodyLine("return pageSize;");
        topLevelClass.addMethod(getPageSize);
    }

    @Override
    public boolean providerGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        addGeneratedAnnotation(topLevelClass, introspectedTable);
        return true;
    }

    @Override
    public boolean clientGenerated(Interface interfaze, IntrospectedTable introspectedTable) {
        addGeneratedAnnotation(interfaze, introspectedTable);
        return true;
    }

    @Override
    public boolean modelBaseRecordClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        addGeneratedAnnotation(topLevelClass, introspectedTable);
        return true;
    }

    @Override
    public boolean modelSetterMethodGenerated(Method method, TopLevelClass topLevelClass, IntrospectedColumn introspectedColumn, IntrospectedTable introspectedTable, ModelClassType modelClassType) {
        method.setReturnType(topLevelClass.getType());
        method.addBodyLine("return this;");
        return true;
    }
}
