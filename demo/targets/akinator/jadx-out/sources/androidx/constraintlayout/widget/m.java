package androidx.constraintlayout.widget;

import android.content.Context;
import io.odeeo.internal.h.vfsA.QCmNMSGd;
import j1.o2;
import java.io.Writer;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public Writer f5525a;

    /* renamed from: b, reason: collision with root package name */
    public Context f5526b;

    /* renamed from: c, reason: collision with root package name */
    public int f5527c;

    /* renamed from: d, reason: collision with root package name */
    public HashMap f5528d;

    public final String a(int i10) {
        String string;
        HashMap map = this.f5528d;
        if (map.containsKey(Integer.valueOf(i10))) {
            return o2.o(new StringBuilder("@+id/"), (String) map.get(Integer.valueOf(i10)), "");
        }
        if (i10 == 0) {
            return "parent";
        }
        try {
            if (i10 != -1) {
                string = this.f5526b.getResources().getResourceEntryName(i10);
            } else {
                StringBuilder sb2 = new StringBuilder("unknown");
                int i11 = this.f5527c + 1;
                this.f5527c = i11;
                sb2.append(i11);
                string = sb2.toString();
            }
        } catch (Exception unused) {
            StringBuilder sb3 = new StringBuilder("unknown");
            int i12 = this.f5527c + 1;
            this.f5527c = i12;
            sb3.append(i12);
            string = sb3.toString();
        }
        map.put(Integer.valueOf(i10), string);
        return "@+id/" + string + "";
    }

    public final void b(int i10, String str) {
        Writer writer = this.f5525a;
        if (i10 != -5) {
            if (i10 == -2) {
                writer.write("\n       " + str + "=\"wrap_content\"");
                return;
            }
            if (i10 == -1) {
                writer.write("\n       " + str + "=\"match_parent\"");
                return;
            }
            writer.write("\n       " + str + "=\"" + i10 + "dp\"");
        }
    }

    public final void d(int i10, int i11, String str) {
        if (i10 != i11) {
            this.f5525a.write("\n       " + str + "=\"" + i10 + "dp\"");
        }
    }

    public final void e(String str, int i10, int i11, String[] strArr) {
        if (i10 != i11) {
            Writer writer = this.f5525a;
            StringBuilder sbO = e3.g.o("\n       ", str, "=\"");
            sbO.append(strArr[i10]);
            sbO.append("\"");
            writer.write(sbO.toString());
        }
    }

    public final void f(int i10, String str) {
        if (i10 == 0 || i10 == -1) {
            return;
        }
        this.f5525a.write("\n       " + str + "=\"" + i10 + "\"\n");
    }

    public final void g(String str, float f10, float f11) {
        Writer writer = this.f5525a;
        if (f10 == f11) {
            return;
        }
        writer.write("\n       ".concat(str));
        writer.write("=\"" + f10 + "\"");
    }

    public final void h(String str, String str2) {
        Writer writer = this.f5525a;
        if (str2 == null || str2.equals(null)) {
            return;
        }
        writer.write("\n       ".concat(str));
        writer.write("=\"" + str2 + "\"");
    }

    public final void i(int i10, String str) {
        Writer writer = this.f5525a;
        if (i10 == -1) {
            return;
        }
        writer.write("\n       ".concat(str));
        writer.write("=\"" + a(i10) + "\"");
    }

    public final void c(String str, boolean z10, boolean z11) {
        if (z10 != z11) {
            this.f5525a.write("\n       " + str + QCmNMSGd.irqTqB + z10 + "dp\"");
        }
    }
}
