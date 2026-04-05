package f6;

import android.content.res.Resources;
import android.graphics.Path;
import android.util.Log;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class s extends r {

    /* renamed from: a, reason: collision with root package name */
    public o3.e[] f55409a;

    /* renamed from: b, reason: collision with root package name */
    public String f55410b;

    /* renamed from: c, reason: collision with root package name */
    public int f55411c;

    public s() {
        this.f55409a = null;
        this.f55411c = 0;
    }

    public boolean canApplyTheme() {
        return false;
    }

    public o3.e[] getPathData() {
        return this.f55409a;
    }

    public String getPathName() {
        return this.f55410b;
    }

    public boolean isClipPath() {
        return false;
    }

    public String nodesToString(o3.e[] eVarArr) {
        String string = " ";
        for (int i10 = 0; i10 < eVarArr.length; i10++) {
            StringBuilder sbU = o2.u(string);
            sbU.append(eVarArr[i10].f77436a);
            sbU.append(":");
            string = sbU.toString();
            for (float f10 : eVarArr[i10].f77437b) {
                StringBuilder sbU2 = o2.u(string);
                sbU2.append(f10);
                sbU2.append(",");
                string = sbU2.toString();
            }
        }
        return string;
    }

    public void printVPath(int i10) {
        String strL = "";
        for (int i11 = 0; i11 < i10; i11++) {
            strL = j1.o2.l(strL, "    ");
        }
        StringBuilder sbT = a.b.t(strL, "current path is :");
        sbT.append(this.f55410b);
        sbT.append(" pathData is ");
        sbT.append(nodesToString(this.f55409a));
        Log.v("VectorDrawableCompat", sbT.toString());
    }

    public void setPathData(o3.e[] eVarArr) {
        if (o3.f.canMorph(this.f55409a, eVarArr)) {
            o3.f.updateNodes(this.f55409a, eVarArr);
        } else {
            this.f55409a = o3.f.deepCopyNodes(eVarArr);
        }
    }

    public void toPath(Path path) {
        path.reset();
        o3.e[] eVarArr = this.f55409a;
        if (eVarArr != null) {
            o3.e.nodesToPath(eVarArr, path);
        }
    }

    public s(s sVar) {
        this.f55409a = null;
        this.f55411c = 0;
        this.f55410b = sVar.f55410b;
        this.f55409a = o3.f.deepCopyNodes(sVar.f55409a);
    }

    public void applyTheme(Resources.Theme theme) {
    }
}
