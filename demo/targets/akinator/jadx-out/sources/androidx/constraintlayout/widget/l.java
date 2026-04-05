package androidx.constraintlayout.widget;

import android.content.Context;
import j1.o2;
import java.io.Writer;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public Writer f5521a;

    /* renamed from: b, reason: collision with root package name */
    public Context f5522b;

    /* renamed from: c, reason: collision with root package name */
    public int f5523c;

    /* renamed from: d, reason: collision with root package name */
    public HashMap f5524d;

    public final String a(int i10) {
        String string;
        HashMap map = this.f5524d;
        if (map.containsKey(Integer.valueOf(i10))) {
            return o2.o(new StringBuilder("'"), (String) map.get(Integer.valueOf(i10)), "'");
        }
        if (i10 == 0) {
            return "'parent'";
        }
        try {
            if (i10 != -1) {
                string = this.f5522b.getResources().getResourceEntryName(i10);
            } else {
                StringBuilder sb2 = new StringBuilder("unknown");
                int i11 = this.f5523c + 1;
                this.f5523c = i11;
                sb2.append(i11);
                string = sb2.toString();
            }
        } catch (Exception unused) {
            StringBuilder sb3 = new StringBuilder("unknown");
            int i12 = this.f5523c + 1;
            this.f5523c = i12;
            sb3.append(i12);
            string = sb3.toString();
        }
        map.put(Integer.valueOf(i10), string);
        return "'" + string + "'";
    }

    public final void b(int i10, int i11, String str, String str2) {
        Writer writer = this.f5521a;
        if (i10 == -1) {
            return;
        }
        writer.write("       ".concat(str));
        writer.write(":[");
        writer.write(a(i10));
        writer.write(" , ");
        writer.write(str2);
        if (i11 != 0) {
            writer.write(" , " + i11);
        }
        writer.write("],\n");
    }

    public final void c(String str, int i10, int i11, int i12, int i13, float f10) {
        Writer writer = this.f5521a;
        if (i10 != 0) {
            if (i10 == -2) {
                writer.write("       " + str + ": 'wrap'\n");
                return;
            }
            if (i10 == -1) {
                writer.write("       " + str + ": 'parent'\n");
                return;
            }
            writer.write("       " + str + ": " + i10 + ",\n");
            return;
        }
        if (i13 == -1 && i12 == -1) {
            if (i11 == 1) {
                writer.write("       " + str + ": '???????????',\n");
                return;
            }
            if (i11 != 2) {
                return;
            }
            writer.write("       " + str + ": '" + f10 + "%',\n");
            return;
        }
        if (i11 == 0) {
            StringBuilder sbR = a.b.r(i12, "       ", str, ": {'spread' ,", ", ");
            sbR.append(i13);
            sbR.append("}\n");
            writer.write(sbR.toString());
            return;
        }
        if (i11 == 1) {
            StringBuilder sbR2 = a.b.r(i12, "       ", str, ": {'wrap' ,", ", ");
            sbR2.append(i13);
            sbR2.append("}\n");
            writer.write(sbR2.toString());
            return;
        }
        if (i11 != 2) {
            return;
        }
        writer.write("       " + str + ": {'" + f10 + "'% ," + i12 + ", " + i13 + "}\n");
    }

    public final void d(int i10, String str) {
        Writer writer = this.f5521a;
        if (i10 == 0 || i10 == -1) {
            return;
        }
        writer.write("       ".concat(str));
        writer.write(":");
        writer.write(", " + i10);
        writer.write("\n");
    }

    public final void e(String str, float f10) {
        Writer writer = this.f5521a;
        if (f10 == -1.0f) {
            return;
        }
        writer.write("       ".concat(str));
        writer.write(": " + f10);
        writer.write(",\n");
    }

    public final void f(String str, String str2) {
        Writer writer = this.f5521a;
        if (str2 == null) {
            return;
        }
        writer.write("       ".concat(str));
        writer.write(":");
        writer.write(", ".concat(str2));
        writer.write("\n");
    }

    public final void g(String str, float f10) {
        Writer writer = this.f5521a;
        if (f10 == 0.5f) {
            return;
        }
        writer.write("       ".concat(str));
        writer.write(": " + f10);
        writer.write(",\n");
    }
}
