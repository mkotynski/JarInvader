import javassist.CannotCompileException;
import javassist.NotFoundException;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class GramaMethods extends gramaBaseVisitor<Integer> {
    ModifyJar jarModificator = new ModifyJar();
    ListingJar jarListing = new ListingJar();
    @Override
    public Integer visitBegin(gramaParser.BeginContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Integer visitInstalljar(gramaParser.InstalljarContext ctx) {
        try {
            Engine.myJar.load(ctx.filename.getText());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 1;
    }

    @Override
    public Integer visitListpackages(gramaParser.ListpackagesContext ctx) {
        jarListing.packageList();
        return super.visitListpackages(ctx);
    }

    @Override
    public Integer visitListclasses(gramaParser.ListclassesContext ctx) {
        jarListing.classList();
        return super.visitListclasses(ctx);
    }

    @Override
    public Integer visitListmethods(gramaParser.ListmethodsContext ctx) {
        try {
            jarListing.methodList(ctx.name.getText());
        } catch (NotFoundException e) {
            e.printStackTrace();
        }
        return super.visitListmethods(ctx);
    }

    @Override
    public Integer visitListfields(gramaParser.ListfieldsContext ctx) {

        try {
            jarListing.fieldList(ctx.name.getText());
        } catch (NotFoundException e) {
            e.printStackTrace();
        }
        return super.visitListfields(ctx);
    }

    @Override
    public Integer visitListctors(gramaParser.ListctorsContext ctx) {
        try {
            jarListing.constructorList(ctx.name.getText());
        } catch (NotFoundException e) {
            e.printStackTrace();
        }
        return super.visitListctors(ctx);
    }

    @Override
    public Integer visitListing(gramaParser.ListingContext ctx) {
        return visitChildren(ctx);
    }

    /************************************************************/

    @Override
    public Integer visitAdding(gramaParser.AddingContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Integer visitAddpackage(gramaParser.AddpackageContext ctx) {
        jarModificator.addPackage(ctx.name.getText());
        return super.visitAddpackage(ctx);
    }

    @Override
    public Integer visitAddclass(gramaParser.AddclassContext ctx) {
        try {
            jarModificator.addClass(ctx.name.getText());
        } catch (CannotCompileException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return super.visitAddclass(ctx);
    }

    @Override
    public Integer visitAddinterface(gramaParser.AddinterfaceContext ctx) {
        try {
            jarModificator.addInterface(ctx.name.getText());
        } catch (CannotCompileException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return super.visitAddinterface(ctx);
    }

    @Override
    public Integer visitAddmethod(gramaParser.AddmethodContext ctx) {
        try {
            jarModificator.addMethod(ctx.expr().name.getText(), ctx.expr().declaration.getText());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return super.visitAddmethod(ctx);
    }

    @Override
    public Integer visitAddfield(gramaParser.AddfieldContext ctx) {
        try {
            jarModificator.addField(ctx.expr().name.getText(), ctx.expr().declaration.getText());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return super.visitAddfield(ctx);
    }

    @Override
    public Integer visitAddcons(gramaParser.AddconsContext ctx) {
        try {
            jarModificator.addConstructor(ctx.expr().name.getText(), ctx.expr().declaration.getText());
        } catch (NotFoundException e) {
            e.printStackTrace();
        } catch (CannotCompileException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return super.visitAddcons(ctx);
    }

    @Override
    public Integer visitSetmethodbody(gramaParser.SetmethodbodyContext ctx) {
        try {
            jarModificator.setMethodBody(ctx.expr2().name.getText(), ctx.expr2().src.getText());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NotFoundException e) {
            e.printStackTrace();
        } catch (CannotCompileException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return super.visitSetmethodbody(ctx);
    }

    @Override
    public Integer visitAddbeformethod(gramaParser.AddbeformethodContext ctx) {
        try {
            jarModificator.addMethodBody(ctx.expr2().name.getText(), ctx.expr2().src.getText(), true);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return super.visitAddbeformethod(ctx);
    }

    @Override
    public Integer visitAddaftermethod(gramaParser.AddaftermethodContext ctx) {

        try {
            jarModificator.addMethodBody(ctx.expr2().name.getText(), ctx.expr2().src.getText(), false);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return super.visitAddaftermethod(ctx);
    }

    @Override
    public Integer visitSetctorbody(gramaParser.SetctorbodyContext ctx) {
        try {
            jarModificator.setConstructorBody(ctx.expr2().name.getText(), ctx.expr2().src.getText());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NotFoundException e) {
            e.printStackTrace();
        } catch (CannotCompileException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return super.visitSetctorbody(ctx);
    }

    @Override
    public Integer visitSavejar(gramaParser.SavejarContext ctx) {
        try {
            Engine.myJar.makeJar(ctx.filename.getText());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return super.visitSavejar(ctx);
    }


    @Override
    public Integer visitRemoving(gramaParser.RemovingContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Integer visitRemovepackage(gramaParser.RemovepackageContext ctx) {
        try {
            jarModificator.removePackage(ctx.name.getText());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return super.visitRemovepackage(ctx);
    }

    @Override
    public Integer visitRemoveclass(gramaParser.RemoveclassContext ctx) {
        try {
            jarModificator.removeClass(ctx.name.getText());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return super.visitRemoveclass(ctx);
    }

    @Override
    public Integer visitRemoveinterface(gramaParser.RemoveinterfaceContext ctx) {
        return super.visitRemoveinterface(ctx);
    }

    @Override
    public Integer visitRemovemethod(gramaParser.RemovemethodContext ctx) {
        try {
            jarModificator.removeMethod(ctx.name.getText());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return super.visitRemovemethod(ctx);
    }

    @Override
    public Integer visitRemoveconstructor(gramaParser.RemoveconstructorContext ctx) {
        try {
            jarModificator.removeConstructor(ctx.name.getText());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return super.visitRemoveconstructor(ctx);
    }

    @Override
    public Integer visitRemovefield(gramaParser.RemovefieldContext ctx) {
        try {
            jarModificator.removeField(ctx.name.getText(), ctx.field.getText());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return super.visitRemovefield(ctx);
    }

    @Override
    public Integer visitScript(gramaParser.ScriptContext ctx) {
        File file = new File(ctx.filename.getText());
        String line;
        Scanner scanString = null;
        try {
            scanString = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        CodePointCharStream input;
        while (scanString.hasNextLine()) {
            line = scanString.nextLine();
            input = CharStreams.fromString(line);
            Interpreter.parse(input);
        }
        return super.visitScript(ctx);
    }
}
