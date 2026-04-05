package ta;

import java.io.Serializable;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class i implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final int f86659b;

    /* renamed from: c, reason: collision with root package name */
    public final String f86660c;

    /* renamed from: e, reason: collision with root package name */
    public final String f86661e;

    /* renamed from: f, reason: collision with root package name */
    public final String f86662f;

    /* renamed from: g, reason: collision with root package name */
    public int f86663g;

    /* renamed from: h, reason: collision with root package name */
    public final int f86664h;

    public i(int i10, String nom, String desc, String pseudo, int i11, int i12) {
        e0.checkNotNullParameter(nom, "nom");
        e0.checkNotNullParameter(desc, "desc");
        e0.checkNotNullParameter(pseudo, "pseudo");
        this.f86659b = i10;
        this.f86660c = nom;
        this.f86661e = desc;
        this.f86662f = pseudo;
        this.f86663g = i11;
        this.f86664h = i12;
    }

    public final int getAwardId() {
        return this.f86659b;
    }

    public final int getDelay() {
        return this.f86663g;
    }

    public final String getDesc() {
        return this.f86661e;
    }

    public final String getNom() {
        return this.f86660c;
    }

    public final int getPosition() {
        return this.f86664h;
    }

    public final String getPseudo() {
        return this.f86662f;
    }

    public final void incDelay() {
        this.f86663g++;
    }

    public final void setDelay(int i10) {
        this.f86663g = i10;
    }
}
