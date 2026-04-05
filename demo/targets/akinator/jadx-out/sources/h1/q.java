package h1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class q {
    public static final s a(s sVar) {
        s sVarA;
        switch (p.$EnumSwitchMapping$0[sVar.getFocusState().ordinal()]) {
            case 1:
            case 2:
                return sVar;
            case 3:
            case 4:
                s focusedChild = sVar.getFocusedChild();
                if (focusedChild == null || (sVarA = a(focusedChild)) == null) {
                    throw new IllegalStateException("no child");
                }
                return sVarA;
            case 5:
            case 6:
                return null;
            default:
                throw new tu.t();
        }
    }

    public static final void b(s sVar) {
        k0.refreshFocusProperties(sVar);
        r0.c children = sVar.getChildren();
        int size = children.getSize();
        if (size > 0) {
            Object[] content = children.getContent();
            int i10 = 0;
            do {
                b((s) content[i10]);
                i10++;
            } while (i10 < size);
        }
    }
}
