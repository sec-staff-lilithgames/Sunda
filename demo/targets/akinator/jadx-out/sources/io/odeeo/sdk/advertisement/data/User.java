package io.odeeo.sdk.advertisement.data;

import io.odeeo.sdk.config.data.ExtendedUserId;
import java.util.List;
import kotlin.jvm.internal.e0;
import lk.c;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class User {

    @c("extended_ids")
    private final List<ExtendedUserId> extendedIds;

    /* renamed from: id, reason: collision with root package name */
    @c("maid")
    private final String f68024id;
    private final String idfv;

    @c("odeeo_id")
    private final String odeeoId;

    @c("player_id")
    private final String playerId;

    public User(String id2, String odeeoId, String playerId, String idfv, List<ExtendedUserId> extendedIds) {
        e0.checkNotNullParameter(id2, "id");
        e0.checkNotNullParameter(odeeoId, "odeeoId");
        e0.checkNotNullParameter(playerId, "playerId");
        e0.checkNotNullParameter(idfv, "idfv");
        e0.checkNotNullParameter(extendedIds, "extendedIds");
        this.f68024id = id2;
        this.odeeoId = odeeoId;
        this.playerId = playerId;
        this.idfv = idfv;
        this.extendedIds = extendedIds;
    }

    public static /* synthetic */ User copy$default(User user, String str, String str2, String str3, String str4, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = user.f68024id;
        }
        if ((i10 & 2) != 0) {
            str2 = user.odeeoId;
        }
        if ((i10 & 4) != 0) {
            str3 = user.playerId;
        }
        if ((i10 & 8) != 0) {
            str4 = user.idfv;
        }
        if ((i10 & 16) != 0) {
            list = user.extendedIds;
        }
        List list2 = list;
        String str5 = str3;
        return user.copy(str, str2, str5, str4, list2);
    }

    public final String component1() {
        return this.f68024id;
    }

    public final String component2() {
        return this.odeeoId;
    }

    public final String component3() {
        return this.playerId;
    }

    public final String component4() {
        return this.idfv;
    }

    public final List<ExtendedUserId> component5() {
        return this.extendedIds;
    }

    public final User copy(String id2, String odeeoId, String playerId, String idfv, List<ExtendedUserId> extendedIds) {
        e0.checkNotNullParameter(id2, "id");
        e0.checkNotNullParameter(odeeoId, "odeeoId");
        e0.checkNotNullParameter(playerId, "playerId");
        e0.checkNotNullParameter(idfv, "idfv");
        e0.checkNotNullParameter(extendedIds, "extendedIds");
        return new User(id2, odeeoId, playerId, idfv, extendedIds);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof User)) {
            return false;
        }
        User user = (User) obj;
        return e0.areEqual(this.f68024id, user.f68024id) && e0.areEqual(this.odeeoId, user.odeeoId) && e0.areEqual(this.playerId, user.playerId) && e0.areEqual(this.idfv, user.idfv) && e0.areEqual(this.extendedIds, user.extendedIds);
    }

    public final List<ExtendedUserId> getExtendedIds() {
        return this.extendedIds;
    }

    public final String getId() {
        return this.f68024id;
    }

    public final String getIdfv() {
        return this.idfv;
    }

    public final String getOdeeoId() {
        return this.odeeoId;
    }

    public final String getPlayerId() {
        return this.playerId;
    }

    public int hashCode() {
        return this.extendedIds.hashCode() + o2.e(o2.e(o2.e(this.f68024id.hashCode() * 31, 31, this.odeeoId), 31, this.playerId), 31, this.idfv);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("User(id=");
        sb2.append(this.f68024id);
        sb2.append(", odeeoId=");
        sb2.append(this.odeeoId);
        sb2.append(", playerId=");
        sb2.append(this.playerId);
        sb2.append(", idfv=");
        sb2.append(this.idfv);
        sb2.append(", extendedIds=");
        return j1.o2.p(sb2, this.extendedIds, ')');
    }
}
