package d2;

import android.content.res.Configuration;
import android.content.res.Resources;
import e3.g;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f51726a = new HashMap();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final n1.c f51727a;

        /* renamed from: b, reason: collision with root package name */
        public final int f51728b;

        public a(n1.c imageVector, int i10) {
            e0.checkNotNullParameter(imageVector, "imageVector");
            this.f51727a = imageVector;
            this.f51728b = i10;
        }

        public static /* synthetic */ a copy$default(a aVar, n1.c cVar, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                cVar = aVar.f51727a;
            }
            if ((i11 & 2) != 0) {
                i10 = aVar.f51728b;
            }
            return aVar.copy(cVar, i10);
        }

        public final n1.c component1() {
            return this.f51727a;
        }

        public final int component2() {
            return this.f51728b;
        }

        public final a copy(n1.c imageVector, int i10) {
            e0.checkNotNullParameter(imageVector, "imageVector");
            return new a(imageVector, i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return e0.areEqual(this.f51727a, aVar.f51727a) && this.f51728b == aVar.f51728b;
        }

        public final int getConfigFlags() {
            return this.f51728b;
        }

        public final n1.c getImageVector() {
            return this.f51727a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f51728b) + (this.f51727a.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("ImageVectorEntry(imageVector=");
            sb2.append(this.f51727a);
            sb2.append(", configFlags=");
            return g.m(sb2, this.f51728b, ')');
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: d2.b$b, reason: collision with other inner class name */
    public static final class C0554b {

        /* renamed from: a, reason: collision with root package name */
        public final Resources.Theme f51729a;

        /* renamed from: b, reason: collision with root package name */
        public final int f51730b;

        public C0554b(Resources.Theme theme, int i10) {
            e0.checkNotNullParameter(theme, "theme");
            this.f51729a = theme;
            this.f51730b = i10;
        }

        public static /* synthetic */ C0554b copy$default(C0554b c0554b, Resources.Theme theme, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                theme = c0554b.f51729a;
            }
            if ((i11 & 2) != 0) {
                i10 = c0554b.f51730b;
            }
            return c0554b.copy(theme, i10);
        }

        public final Resources.Theme component1() {
            return this.f51729a;
        }

        public final int component2() {
            return this.f51730b;
        }

        public final C0554b copy(Resources.Theme theme, int i10) {
            e0.checkNotNullParameter(theme, "theme");
            return new C0554b(theme, i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0554b)) {
                return false;
            }
            C0554b c0554b = (C0554b) obj;
            return e0.areEqual(this.f51729a, c0554b.f51729a) && this.f51730b == c0554b.f51730b;
        }

        public final int getId() {
            return this.f51730b;
        }

        public final Resources.Theme getTheme() {
            return this.f51729a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f51730b) + (this.f51729a.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Key(theme=");
            sb2.append(this.f51729a);
            sb2.append(", id=");
            return g.m(sb2, this.f51730b, ')');
        }
    }

    public final void clear() {
        this.f51726a.clear();
    }

    public final a get(C0554b key) {
        e0.checkNotNullParameter(key, "key");
        WeakReference weakReference = (WeakReference) this.f51726a.get(key);
        if (weakReference != null) {
            return (a) weakReference.get();
        }
        return null;
    }

    public final void prune(int i10) {
        Iterator it = this.f51726a.entrySet().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            e0.checkNotNullExpressionValue(next, "it.next()");
            a aVar = (a) ((WeakReference) ((Map.Entry) next).getValue()).get();
            if (aVar == null || Configuration.needNewResources(i10, aVar.getConfigFlags())) {
                it.remove();
            }
        }
    }

    public final void set(C0554b key, a imageVectorEntry) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(imageVectorEntry, "imageVectorEntry");
        this.f51726a.put(key, new WeakReference(imageVectorEntry));
    }
}
