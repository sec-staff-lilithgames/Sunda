package ta;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class c implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final int f86631b;

    /* renamed from: c, reason: collision with root package name */
    public int f86632c;

    /* renamed from: e, reason: collision with root package name */
    public final int f86633e;

    /* renamed from: f, reason: collision with root package name */
    public final int f86634f;

    /* renamed from: g, reason: collision with root package name */
    public final String f86635g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f86636h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f86637i;

    /* renamed from: j, reason: collision with root package name */
    public final d f86638j;

    public c(int i10, int i11, int i12, int i13, String str, ArrayList<f> mTopPlayers, ArrayList<f> mClassementPlayers, d dVar) {
        e0.checkNotNullParameter(mTopPlayers, "mTopPlayers");
        e0.checkNotNullParameter(mClassementPlayers, "mClassementPlayers");
        this.f86631b = i10;
        this.f86632c = i11;
        this.f86633e = i12;
        this.f86634f = i13;
        this.f86635g = str;
        this.f86636h = mTopPlayers;
        this.f86637i = mClassementPlayers;
        this.f86638j = dVar;
    }

    public final void decrementeTempsRestant() {
        int i10 = this.f86632c;
        if (i10 > 0) {
            this.f86632c = i10 - 1;
        }
    }

    public final boolean getCanSignalVote() {
        return this.f86634f == 1;
    }

    public final boolean getCanVote() {
        return this.f86633e == 1;
    }

    public final ArrayList<f> getClassementPlayers() {
        return this.f86637i;
    }

    public final d getFakes() {
        return this.f86638j;
    }

    public final String getId() {
        String str = this.f86635g;
        return str == null ? "" : str;
    }

    public final int getNbParticipants() {
        return this.f86631b;
    }

    public final int getTempsRestant() {
        return this.f86632c;
    }

    public final ArrayList<f> getTopPlayers() {
        return this.f86636h;
    }

    public final void setTempsRestant(int i10) {
        this.f86632c = i10;
    }
}
