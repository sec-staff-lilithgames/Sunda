package m5;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f74030a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f74031b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public String f74032a = "";

        /* renamed from: b, reason: collision with root package name */
        public boolean f74033b = true;

        public final b build() {
            return new b(this.f74032a, this.f74033b);
        }

        public final a setAdsSdkName(String adsSdkName) {
            e0.checkNotNullParameter(adsSdkName, "adsSdkName");
            if (adsSdkName.length() <= 0) {
                throw new IllegalStateException("adsSdkName must be set");
            }
            this.f74032a = adsSdkName;
            return this;
        }

        public final a setShouldRecordObservation(boolean z10) {
            this.f74033b = z10;
            return this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return e0.areEqual(this.f74030a, bVar.f74030a) && this.f74031b == bVar.f74031b;
    }

    public final String getAdsSdkName() {
        return this.f74030a;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f74031b) + (this.f74030a.hashCode() * 31);
    }

    public final boolean shouldRecordObservation() {
        return this.f74031b;
    }

    public String toString() {
        return "GetTopicsRequest: adsSdkName=" + this.f74030a + ", shouldRecordObservation=" + this.f74031b;
    }

    public b(String adsSdkName, boolean z10) {
        e0.checkNotNullParameter(adsSdkName, "adsSdkName");
        this.f74030a = adsSdkName;
        this.f74031b = z10;
    }

    public /* synthetic */ b(String str, boolean z10, int i10, u uVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? false : z10);
    }
}
