package com.vungle.ads.fpd;

import androidx.core.app.NotificationCompat;
import com.vungle.ads.internal.util.RangeUtil;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import tu.f;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Serializable
/* loaded from: classes8.dex */
public final class SessionContext {
    public static final Companion Companion = new Companion(null);
    private List<String> friends;
    private Float healthPercentile;
    private Float inGamePurchasesUSD;
    private Float levelPercentile;
    private String page;
    private Integer sessionDuration;
    private Integer sessionStartTime;
    private Integer signupDate;
    private Integer timeSpent;
    private String userID;
    private Float userLevelPercentile;
    private Float userScorePercentile;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final KSerializer<SessionContext> serializer() {
            return SessionContext$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public SessionContext() {
    }

    public static final void write$Self(SessionContext self, CompositeEncoder output, SerialDescriptor serialDesc) {
        e0.checkNotNullParameter(self, "self");
        e0.checkNotNullParameter(output, "output");
        e0.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.levelPercentile != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, FloatSerializer.INSTANCE, self.levelPercentile);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.page != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.page);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.timeSpent != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, IntSerializer.INSTANCE, self.timeSpent);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.signupDate != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, IntSerializer.INSTANCE, self.signupDate);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.userScorePercentile != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, FloatSerializer.INSTANCE, self.userScorePercentile);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.userID != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.userID);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.friends != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, new ArrayListSerializer(StringSerializer.INSTANCE), self.friends);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.userLevelPercentile != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, FloatSerializer.INSTANCE, self.userLevelPercentile);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.healthPercentile != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, FloatSerializer.INSTANCE, self.healthPercentile);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.sessionStartTime != null) {
            output.encodeNullableSerializableElement(serialDesc, 9, IntSerializer.INSTANCE, self.sessionStartTime);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || self.sessionDuration != null) {
            output.encodeNullableSerializableElement(serialDesc, 10, IntSerializer.INSTANCE, self.sessionDuration);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 11) && self.inGamePurchasesUSD == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 11, FloatSerializer.INSTANCE, self.inGamePurchasesUSD);
    }

    public final SessionContext setFriends(List<String> list) {
        this.friends = list != null ? y0.toMutableList((Collection) list) : null;
        return this;
    }

    public final SessionContext setHealthPercentile(float f10) {
        if (RangeUtil.INSTANCE.isInRange(f10, 0.0f, 100.0f)) {
            this.healthPercentile = Float.valueOf(f10);
        }
        return this;
    }

    public final SessionContext setInGamePurchasesUSD(float f10) {
        if (RangeUtil.isInRange$default(RangeUtil.INSTANCE, f10, 0.0f, 0.0f, 4, (Object) null)) {
            this.inGamePurchasesUSD = Float.valueOf(f10);
        }
        return this;
    }

    public final SessionContext setLevelPercentile(float f10) {
        if (RangeUtil.INSTANCE.isInRange(f10, 0.0f, 100.0f)) {
            this.levelPercentile = Float.valueOf(f10);
        }
        return this;
    }

    public final SessionContext setPage(String page) {
        e0.checkNotNullParameter(page, "page");
        this.page = page;
        return this;
    }

    public final SessionContext setSessionDuration(int i10) {
        this.sessionDuration = Integer.valueOf(i10);
        return this;
    }

    public final SessionContext setSessionStartTime(int i10) {
        this.sessionStartTime = Integer.valueOf(i10);
        return this;
    }

    public final SessionContext setSignupDate(int i10) {
        this.signupDate = Integer.valueOf(i10);
        return this;
    }

    public final SessionContext setTimeSpent(int i10) {
        this.timeSpent = Integer.valueOf(i10);
        return this;
    }

    public final SessionContext setUserID(String userID) {
        e0.checkNotNullParameter(userID, "userID");
        this.userID = userID;
        return this;
    }

    public final SessionContext setUserLevelPercentile(float f10) {
        if (RangeUtil.INSTANCE.isInRange(f10, 0.0f, 100.0f)) {
            this.userLevelPercentile = Float.valueOf(f10);
        }
        return this;
    }

    public final SessionContext setUserScorePercentile(float f10) {
        if (RangeUtil.INSTANCE.isInRange(f10, 0.0f, 100.0f)) {
            this.userScorePercentile = Float.valueOf(f10);
        }
        return this;
    }

    @f
    public /* synthetic */ SessionContext(int i10, @SerialName("level_percentile") Float f10, @SerialName("page") String str, @SerialName("time_spent") Integer num, @SerialName("signup_date") Integer num2, @SerialName("user_score_percentile") Float f11, @SerialName("user_id") String str2, @SerialName("friends") List list, @SerialName("user_level_percentile") Float f12, @SerialName("health_percentile") Float f13, @SerialName("session_start_time") Integer num3, @SerialName("session_duration") Integer num4, @SerialName("in_game_purchases_usd") Float f14, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i10 & 1) == 0) {
            this.levelPercentile = null;
        } else {
            this.levelPercentile = f10;
        }
        if ((i10 & 2) == 0) {
            this.page = null;
        } else {
            this.page = str;
        }
        if ((i10 & 4) == 0) {
            this.timeSpent = null;
        } else {
            this.timeSpent = num;
        }
        if ((i10 & 8) == 0) {
            this.signupDate = null;
        } else {
            this.signupDate = num2;
        }
        if ((i10 & 16) == 0) {
            this.userScorePercentile = null;
        } else {
            this.userScorePercentile = f11;
        }
        if ((i10 & 32) == 0) {
            this.userID = null;
        } else {
            this.userID = str2;
        }
        if ((i10 & 64) == 0) {
            this.friends = null;
        } else {
            this.friends = list;
        }
        if ((i10 & 128) == 0) {
            this.userLevelPercentile = null;
        } else {
            this.userLevelPercentile = f12;
        }
        if ((i10 & NotificationCompat.FLAG_LOCAL_ONLY) == 0) {
            this.healthPercentile = null;
        } else {
            this.healthPercentile = f13;
        }
        if ((i10 & 512) == 0) {
            this.sessionStartTime = null;
        } else {
            this.sessionStartTime = num3;
        }
        if ((i10 & 1024) == 0) {
            this.sessionDuration = null;
        } else {
            this.sessionDuration = num4;
        }
        if ((i10 & 2048) == 0) {
            this.inGamePurchasesUSD = null;
        } else {
            this.inGamePurchasesUSD = f14;
        }
    }

    @SerialName("friends")
    private static /* synthetic */ void getFriends$annotations() {
    }

    @SerialName("health_percentile")
    private static /* synthetic */ void getHealthPercentile$annotations() {
    }

    @SerialName("in_game_purchases_usd")
    private static /* synthetic */ void getInGamePurchasesUSD$annotations() {
    }

    @SerialName("level_percentile")
    private static /* synthetic */ void getLevelPercentile$annotations() {
    }

    @SerialName("page")
    private static /* synthetic */ void getPage$annotations() {
    }

    @SerialName("session_duration")
    private static /* synthetic */ void getSessionDuration$annotations() {
    }

    @SerialName("session_start_time")
    private static /* synthetic */ void getSessionStartTime$annotations() {
    }

    @SerialName("signup_date")
    private static /* synthetic */ void getSignupDate$annotations() {
    }

    @SerialName("time_spent")
    private static /* synthetic */ void getTimeSpent$annotations() {
    }

    @SerialName("user_id")
    private static /* synthetic */ void getUserID$annotations() {
    }

    @SerialName("user_level_percentile")
    private static /* synthetic */ void getUserLevelPercentile$annotations() {
    }

    @SerialName("user_score_percentile")
    private static /* synthetic */ void getUserScorePercentile$annotations() {
    }
}
