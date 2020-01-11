import javassist.CannotCompileException;
import javassist.NotFoundException;

import java.io.IOException;

public class InterpreterMethod extends gramaBaseVisitor<Integer> {
    //Listing listing = new Listing();
    JarFile jarFile = new JarFile();
    @Override
    public Integer visitBegin(gramaParser.BeginContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Integer visitInstalljar(gramaParser.InstalljarContext ctx) {
        try {
            jarFile.load(ctx.filename.getText());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 1;
    }

    @Override
    public Integer visitListpackages(gramaParser.ListpackagesContext ctx) {
        Listing.packageList();
        return super.visitListpackages(ctx);
    }

    @Override
    public Integer visitListclasses(gramaParser.ListclassesContext ctx) {
        Listing.classList();
        return super.visitListclasses(ctx);
    }

    @Override
    public Integer visitListmethods(gramaParser.ListmethodsContext ctx) {
        try {
            Listing.methodList(ctx.name.getText());
        } catch (NotFoundException e) {
            e.printStackTrace();
        }
        return super.visitListmethods(ctx);
    }

    @Override
    public Integer visitListfields(gramaParser.ListfieldsContext ctx) {

        try {
            Listing.fieldList(ctx.name.getText());
        } catch (NotFoundException e) {
            e.printStackTrace();
        }
        return super.visitListfields(ctx);
    }

    @Override
    public Integer visitListctors(gramaParser.ListctorsContext ctx) {
        try {
            Listing.constructorList(ctx.name.getText());
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
        Adding.addPackage(ctx.name.getText());
        return super.visitAddpackage(ctx);
    }

    @Override
    public Integer visitAddclass(gramaParser.AddclassContext ctx) {
        try {
            Adding.addClass(ctx.name.getText());
        } catch (CannotCompileException e) {
            e.printStackTrace();
        }
        return super.visitAddclass(ctx);
    }

    @Override
    public Integer visitAddinterface(gramaParser.AddinterfaceContext ctx) {
        try {
            Adding.addInterface(ctx.name.getText());
        } catch (CannotCompileException e) {
            e.printStackTrace();
        }
        return super.visitAddinterface(ctx);
    }

    @Override
    public Integer visitAddmethod(gramaParser.AddmethodContext ctx) {
        try {
            Adding.addMethod(ctx.expr().name.getText(), ctx.expr().declaration.getText());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return super.visitAddmethod(ctx);
    }

    @Override
    public Integer visitAddfield(gramaParser.AddfieldContext ctx) {
        try {
            Adding.addField(ctx.expr().name.getText(), ctx.expr().declaration.getText());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return super.visitAddfield(ctx);
    }

    @Override
    public Integer visitAddcons(gramaParser.AddconsContext ctx) {
        try {
            Adding.addConstructor(ctx.expr().name.getText(), ctx.expr().declaration.getText());
        } catch (NotFoundException e) {
            e.printStackTrace();
        } catch (CannotCompileException e) {
            e.printStackTrace();
        }
        return super.visitAddcons(ctx);
    }

    @Override
    public Integer visitSetmethodbody(gramaParser.SetmethodbodyContext ctx) {
        try {
            Adding.setMethodBody(ctx.expr2().name.getText(), ctx.expr2().src.getText());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NotFoundException e) {
            e.printStackTrace();
        } catch (CannotCompileException e) {
            e.printStackTrace();
        }
        return super.visitSetmethodbody(ctx);
    }

    @Override
    public Integer visitAddbeformethod(gramaParser.AddbeformethodContext ctx) {
        try {
            Adding.addMethodBody(ctx.expr2().name.getText(), ctx.expr2().src.getText(),true);
        } catch (NotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (CannotCompileException e) {
            e.printStackTrace();
        }
        return super.visitAddbeformethod(ctx);
    }

    @Override
    public Integer visitAddaftermethod(gramaParser.AddaftermethodContext ctx) {
        try {
            Adding.addMethodBody(ctx.expr2().name.getText(), ctx.expr2().src.getText(),false);
        } catch (NotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (CannotCompileException e) {
            e.printStackTrace();
        }
        return super.visitAddaftermethod(ctx);
    }

    @Override
    public Integer visitSetctorbody(gramaParser.SetctorbodyContext ctx) {
        try {
            Adding.setConstructorBody(ctx.expr2().name.getText(), ctx.expr2().src.getText());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NotFoundException e) {
            e.printStackTrace();
        } catch (CannotCompileException e) {
            e.printStackTrace();
        }
        return super.visitSetctorbody(ctx);
    }

    @Override
    public Integer visitSavejar(gramaParser.SavejarContext ctx) {
        try {
            jarFile.makeJar(ctx.filename.getText());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return super.visitSavejar(ctx);
    }
}
