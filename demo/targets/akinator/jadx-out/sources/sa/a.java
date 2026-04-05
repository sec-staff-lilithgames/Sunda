package sa;

import com.digidust.elokence.akinator.webservices.cheatmanagement.CheatManagement$AwardsToVote;
import e3.g;
import java.util.ArrayList;
import kotlin.jvm.internal.e0;
import w0.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f85575a;

    /* renamed from: b, reason: collision with root package name */
    public int f85576b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f85577c;

    public a(int i10, int i11, ArrayList<CheatManagement$AwardsToVote> listAwardsToVote) {
        e0.checkNotNullParameter(listAwardsToVote, "listAwardsToVote");
        this.f85575a = i10;
        this.f85576b = i11;
        this.f85577c = listAwardsToVote;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ a copy$default(a aVar, int i10, int i11, ArrayList arrayList, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = aVar.f85575a;
        }
        if ((i12 & 2) != 0) {
            i11 = aVar.f85576b;
        }
        if ((i12 & 4) != 0) {
            arrayList = aVar.f85577c;
        }
        return aVar.copy(i10, i11, arrayList);
    }

    public final int component1() {
        return this.f85575a;
    }

    public final int component2() {
        return this.f85576b;
    }

    public final ArrayList<CheatManagement$AwardsToVote> component3() {
        return this.f85577c;
    }

    public final a copy(int i10, int i11, ArrayList<CheatManagement$AwardsToVote> listAwardsToVote) {
        e0.checkNotNullParameter(listAwardsToVote, "listAwardsToVote");
        return new a(i10, i11, listAwardsToVote);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f85575a == aVar.f85575a && this.f85576b == aVar.f85576b && e0.areEqual(this.f85577c, aVar.f85577c);
    }

    public final ArrayList<CheatManagement$AwardsToVote> getListAwardsToVote() {
        return this.f85577c;
    }

    public final int getMoreVotes() {
        return this.f85576b;
    }

    public final int getScore() {
        return this.f85575a;
    }

    public int hashCode() {
        return this.f85577c.hashCode() + g.d(this.f85576b, Integer.hashCode(this.f85575a) * 31, 31);
    }

    public final boolean moreVotes() {
        return this.f85576b == 1;
    }

    public final void setMoreVotes(int i10) {
        this.f85576b = i10;
    }

    public final void setScore(int i10) {
        this.f85575a = i10;
    }

    public String toString() {
        StringBuilder sbF = i.f(this.f85575a, this.f85576b, "InfoVote(score=", ", moreVotes=", ", listAwardsToVote=");
        sbF.append(this.f85577c);
        sbF.append(")");
        return sbF.toString();
    }
}
