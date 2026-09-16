package com.example.task09;

import codecheck.CodeParser;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.VariableDeclarator;
import com.github.javaparser.ast.expr.NameExpr;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;


public class Task09MainTest {

    @Test
    public void testResult() {
        Assertions.assertThat(Task09Main.solution()).as("Result").isEqualTo(0.0d);
    }

    @Test
    public void testContent() throws Exception {
        MethodDeclaration method = new CodeParser("task09", Task09Main.class).src("src/main/java").findSingleMethod("solution");
        List<VariableDeclarator> varDecls = method.findAll(VariableDeclarator.class);
        for (VariableDeclarator varDecl : varDecls) {
            if (varDecl.getName().asString().equals("a")) {
                Assertions.assertThat(varDecl.getTypeAsString() + " " + varDecl.toString()).as("Variable 'a'").isEqualTo("float a = 1.0f");
            } else if (varDecl.getName().asString().equals("b")) {
                Assertions.assertThat(varDecl.getTypeAsString() + " " + varDecl.toString()).as("Variable 'b'").isEqualTo("float b = 3.0f");
            } else if (varDecl.getName().asString().equals("c")) {
                Assertions.assertThat(varDecl.getTypeAsString() + " " + varDecl.toString()).as("Variable 'c'").isEqualTo("float c = 1.0e9f");
            } else if (varDecl.getName().asString().equals("x")) {
                Assertions.assertThat(varDecl.getTypeAsString()).as("Variable 'x' type").isEqualTo("double");
                String names = varDecl.getInitializer().get().findAll(NameExpr.class).stream().map(NameExpr::getNameAsString).sorted().collect(Collectors.joining(","));
                Assertions.assertThat(names).as("Variable 'x' initializer expression should contain a,b,c").isEqualTo("a,b,c");
            } else {
                Assertions.fail("Unexpected variable: " + varDecl.getName().asString());
            }
        }
    }
}
