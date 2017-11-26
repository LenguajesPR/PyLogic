package Classes;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Interpreter {

    public static void main(String[] args) throws Exception {
        PyLogic3Lexer lexer = new PyLogic3Lexer(CharStreams.fromFileName("src\\Files\\input.txt"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PyLogic3Parser parser = new PyLogic3Parser(tokens);
        ParseTree tree = parser.file_input();

        PyLogicVisitor<Object> loader = new PyLogicVisitor<Object>();
        loader.init();
        loader.visit(tree);
    }
}
