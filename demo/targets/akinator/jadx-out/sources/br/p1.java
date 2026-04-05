package br;

import android.graphics.Bitmap;
import java.util.List;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class p1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f9974a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9975b;

    /* renamed from: c, reason: collision with root package name */
    public final List f9976c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final q1 f9977a;

        /* renamed from: b, reason: collision with root package name */
        public final String f9978b;

        /* renamed from: c, reason: collision with root package name */
        public final String f9979c;

        /* renamed from: d, reason: collision with root package name */
        public final Bitmap f9980d;

        public a(q1 type, String title, String data) {
            kotlin.jvm.internal.e0.checkNotNullParameter(type, "type");
            kotlin.jvm.internal.e0.checkNotNullParameter(title, "title");
            kotlin.jvm.internal.e0.checkNotNullParameter(data, "data");
            this.f9977a = type;
            this.f9978b = title;
            this.f9979c = data;
        }

        public static /* synthetic */ a copy$default(a aVar, q1 q1Var, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                q1Var = aVar.f9977a;
            }
            if ((i10 & 2) != 0) {
                str = aVar.f9978b;
            }
            if ((i10 & 4) != 0) {
                str2 = aVar.f9979c;
            }
            return aVar.copy(q1Var, str, str2);
        }

        public final q1 component1() {
            return this.f9977a;
        }

        public final String component2() {
            return this.f9978b;
        }

        public final String component3() {
            return this.f9979c;
        }

        public final a copy(q1 type, String title, String data) {
            kotlin.jvm.internal.e0.checkNotNullParameter(type, "type");
            kotlin.jvm.internal.e0.checkNotNullParameter(title, "title");
            kotlin.jvm.internal.e0.checkNotNullParameter(data, "data");
            return new a(type, title, data);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f9977a == aVar.f9977a && kotlin.jvm.internal.e0.areEqual(this.f9978b, aVar.f9978b) && kotlin.jvm.internal.e0.areEqual(this.f9979c, aVar.f9979c);
        }

        public final String getData() {
            return this.f9979c;
        }

        public final Bitmap getIcon() {
            return this.f9980d;
        }

        public final String getTitle() {
            return this.f9978b;
        }

        public final q1 getType() {
            return this.f9977a;
        }

        public int hashCode() {
            return this.f9979c.hashCode() + o2.e(this.f9977a.hashCode() * 31, 31, this.f9978b);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Action(type=");
            sb2.append(this.f9977a);
            sb2.append(", title=");
            sb2.append(this.f9978b);
            sb2.append(", data=");
            return o2.q(sb2, this.f9979c, ')');
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(q1 type, String title, String data, Bitmap bitmap) {
            this(type, title, data);
            kotlin.jvm.internal.e0.checkNotNullParameter(type, "type");
            kotlin.jvm.internal.e0.checkNotNullParameter(title, "title");
            kotlin.jvm.internal.e0.checkNotNullParameter(data, "data");
            this.f9980d = bitmap;
        }

        public /* synthetic */ a(q1 q1Var, String str, String str2, Bitmap bitmap, int i10, kotlin.jvm.internal.u uVar) {
            this(q1Var, str, str2, (i10 & 8) != 0 ? null : bitmap);
        }
    }

    public p1(String title, String subtitle, List<a> actions) {
        kotlin.jvm.internal.e0.checkNotNullParameter(title, "title");
        kotlin.jvm.internal.e0.checkNotNullParameter(subtitle, "subtitle");
        kotlin.jvm.internal.e0.checkNotNullParameter(actions, "actions");
        this.f9974a = title;
        this.f9975b = subtitle;
        this.f9976c = actions;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ p1 copy$default(p1 p1Var, String str, String str2, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = p1Var.f9974a;
        }
        if ((i10 & 2) != 0) {
            str2 = p1Var.f9975b;
        }
        if ((i10 & 4) != 0) {
            list = p1Var.f9976c;
        }
        return p1Var.copy(str, str2, list);
    }

    public final String component1() {
        return this.f9974a;
    }

    public final String component2() {
        return this.f9975b;
    }

    public final List<a> component3() {
        return this.f9976c;
    }

    public final p1 copy(String title, String subtitle, List<a> actions) {
        kotlin.jvm.internal.e0.checkNotNullParameter(title, "title");
        kotlin.jvm.internal.e0.checkNotNullParameter(subtitle, "subtitle");
        kotlin.jvm.internal.e0.checkNotNullParameter(actions, "actions");
        return new p1(title, subtitle, actions);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f9974a, p1Var.f9974a) && kotlin.jvm.internal.e0.areEqual(this.f9975b, p1Var.f9975b) && kotlin.jvm.internal.e0.areEqual(this.f9976c, p1Var.f9976c);
    }

    public final List<a> getActions() {
        return this.f9976c;
    }

    public final String getSubtitle() {
        return this.f9975b;
    }

    public final String getTitle() {
        return this.f9974a;
    }

    public int hashCode() {
        return this.f9976c.hashCode() + o2.e(this.f9974a.hashCode() * 31, 31, this.f9975b);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("PrivacySheetParams(title=");
        sb2.append(this.f9974a);
        sb2.append(", subtitle=");
        sb2.append(this.f9975b);
        sb2.append(", actions=");
        return j1.o2.p(sb2, this.f9976c, ')');
    }
}
