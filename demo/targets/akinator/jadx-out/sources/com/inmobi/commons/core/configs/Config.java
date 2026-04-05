package com.inmobi.commons.core.configs;

import com.inmobi.media.C2715c6;
import com.inmobi.media.I2;
import com.inmobi.media.InterfaceC2765f5;
import kotlin.jvm.internal.e0;
import org.json.JSONObject;
import sv.k0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class Config {
    public static final I2 Companion = new I2();

    @InterfaceC2765f5
    private String accountId;
    private C2715c6 includeIds = new C2715c6(false, 1, null);

    @InterfaceC2765f5
    private long lastUpdateTimeStamp;

    public Config(String str) {
        this.accountId = str;
    }

    public static final Config fromJSON(String str, JSONObject jSONObject, String str2, long j10) {
        Companion.getClass();
        return I2.a(str, jSONObject, str2, j10);
    }

    public static final Config newInstance(String str, String str2) {
        Companion.getClass();
        return I2.a(str, str2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Config)) {
            return false;
        }
        Config config = (Config) obj;
        if (e0.areEqual(config.getType(), getType())) {
            String str = this.accountId;
            if (str == null && config.accountId == null) {
                return true;
            }
            if (str != null && k0.equals$default(str, config.accountId, false, 2, null)) {
                return true;
            }
        }
        return false;
    }

    public final String getAccountId() {
        return this.accountId;
    }

    public final String getAccountId$media_release() {
        return this.accountId;
    }

    public final C2715c6 getIncludeIdParams() {
        return this.includeIds;
    }

    public final long getLastUpdateTimeStamp() {
        return this.lastUpdateTimeStamp;
    }

    public abstract String getType();

    public int hashCode() {
        int iHashCode = getType().hashCode();
        String str = this.accountId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public abstract boolean isValid();

    public final void setAccountId$media_release(String str) {
        this.accountId = str;
    }

    public final void setLastUpdateTimeStamp(long j10) {
        this.lastUpdateTimeStamp = j10;
    }

    public abstract JSONObject toJson();
}
