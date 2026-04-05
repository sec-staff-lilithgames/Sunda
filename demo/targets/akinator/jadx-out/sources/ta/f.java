package ta;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.e0;
import tu.v;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class f implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final int f86644b;

    /* renamed from: c, reason: collision with root package name */
    public final String f86645c;

    /* renamed from: e, reason: collision with root package name */
    public final int f86646e;

    /* renamed from: f, reason: collision with root package name */
    public final int f86647f;

    /* renamed from: g, reason: collision with root package name */
    public final int f86648g;

    /* renamed from: h, reason: collision with root package name */
    public final int f86649h;

    /* renamed from: i, reason: collision with root package name */
    public final int f86650i;

    /* renamed from: j, reason: collision with root package name */
    public final int f86651j;

    /* renamed from: k, reason: collision with root package name */
    public final int f86652k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f86653l;

    /* renamed from: m, reason: collision with root package name */
    public final int f86654m;

    /* renamed from: n, reason: collision with root package name */
    public final int f86655n;

    /* renamed from: o, reason: collision with root package name */
    public final int f86656o;

    public f(int i10, String pseudo, int i11, int i12, int i13, int i14, int i15, int i16, int i17, ArrayList<ArrayList<v>> histoBadges, int i18, int i19, int i20) {
        e0.checkNotNullParameter(pseudo, "pseudo");
        e0.checkNotNullParameter(histoBadges, "histoBadges");
        this.f86644b = i10;
        this.f86645c = pseudo;
        this.f86646e = i11;
        this.f86647f = i12;
        this.f86648g = i13;
        this.f86649h = i14;
        this.f86650i = i15;
        this.f86651j = i16;
        this.f86652k = i17;
        this.f86653l = histoBadges;
        this.f86654m = i18;
        this.f86655n = i19;
        this.f86656o = i20;
    }

    public final int getActif() {
        return this.f86647f;
    }

    public final ArrayList<ArrayList<v>> getBadges() {
        return this.f86653l;
    }

    public final int getMaxTrophee() {
        return this.f86655n;
    }

    public final int getNbBadges(int i10) {
        if (i10 == 1) {
            return this.f86652k;
        }
        if (i10 == 2) {
            return this.f86651j;
        }
        if (i10 == 3) {
            return this.f86650i;
        }
        if (i10 == 4) {
            return this.f86649h;
        }
        if (i10 != 5) {
            return 0;
        }
        return this.f86648g;
    }

    public final int getNbDDJ() {
        return this.f86654m;
    }

    public final int getNbMaxTrophee() {
        return this.f86656o;
    }

    public final String getNom() {
        return this.f86645c;
    }

    public final int getPosition() {
        return this.f86644b;
    }

    public final String getPseudo() {
        return this.f86645c;
    }

    public final int getRang() {
        return this.f86644b;
    }

    public final int getScore() {
        return this.f86646e;
    }
}
