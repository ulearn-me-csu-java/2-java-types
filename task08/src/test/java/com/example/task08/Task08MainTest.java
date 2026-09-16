package com.example.task08;

import codecheck.CodeParser;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.VariableDeclarator;
import com.github.javaparser.ast.stmt.ReturnStmt;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


public class Task08MainTest {

    @Test
    public void testResult() {
        Assertions.assertThat(Task08Main.solution()).as("Result").isTrue();
    }

    @Test
    public void testContent() throws Exception {
        MethodDeclaration method = new CodeParser("task08", Task08Main.class).src("src/main/java").findSingleMethod("solution");
        Assertions.assertThat(method.findAll(VariableDeclarator.class)).as("Declared variables").hasSize(1).allMatch((v) -> v.getName().asString().equals("x"), "variable name = x");
        Assertions.assertThat(method.findAll(ReturnStmt.class)).as("Return operator").hasSize(1).allMatch((w) -> w.toString().equals("return x == x + 1;"), "return x == x + 1");
    }
}
