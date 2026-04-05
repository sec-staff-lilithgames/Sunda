package vw;

import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class g2 {

    /* renamed from: a, reason: collision with root package name */
    public final i2 f89833a;

    public g2(i2 i2Var) {
        this.f89833a = i2Var;
    }

    public final Object a(h2 h2Var) throws Exception {
        String[] paths = this.f89833a.getPaths();
        StringBuilder sb2 = new StringBuilder();
        if (paths.length > 0) {
            Arrays.sort(paths);
            for (String str : paths) {
                sb2.append(str);
                sb2.append('>');
            }
        }
        return new a(h2Var, sb2.toString());
    }

    public Object getKey() throws Exception {
        return this.f89833a.isAttribute() ? a(h2.f89874b) : a(h2.f89875c);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final h2 f89834a;

        /* renamed from: b, reason: collision with root package name */
        public final String f89835b;

        public a(h2 h2Var, String str) throws Exception {
            this.f89835b = str;
            this.f89834a = h2Var;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return equals((a) obj);
            }
            return false;
        }

        public int hashCode() {
            return this.f89835b.hashCode();
        }

        public String toString() {
            return this.f89835b;
        }

        public boolean equals(a aVar) {
            if (this.f89834a == aVar.f89834a) {
                return aVar.f89835b.equals(this.f89835b);
            }
            return false;
        }
    }
}
