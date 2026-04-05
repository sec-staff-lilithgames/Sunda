package com.amazon.aps.ads.model;

import com.amazon.device.ads.DtbLog;
import cv.a;
import cv.b;
import java.io.Serializable;
import kotlin.jvm.internal.e0;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ApsSlotInfoExtra implements Serializable {
    private VideoStartDelayOption videoStartDelay = VideoStartDelayOption.NO_VALUE;
    private VideoPlcmtOption videoPlcmt = VideoPlcmtOption.NO_VALUE;
    private VideoPlacementOption videoPlacement = VideoPlacementOption.NO_VALUE;
    private PosOption pos = PosOption.NO_VALUE;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class PosOption {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ PosOption[] $VALUES;
        private final int value;
        public static final PosOption NO_VALUE = new PosOption("NO_VALUE", 0, -1);
        public static final PosOption UNKNOWN = new PosOption("UNKNOWN", 1, 0);
        public static final PosOption ABOVE_THE_FOLD = new PosOption("ABOVE_THE_FOLD", 2, 1);
        public static final PosOption BELOW_THE_FOLD = new PosOption("BELOW_THE_FOLD", 3, 3);

        private static final /* synthetic */ PosOption[] $values() {
            return new PosOption[]{NO_VALUE, UNKNOWN, ABOVE_THE_FOLD, BELOW_THE_FOLD};
        }

        static {
            PosOption[] posOptionArr$values = $values();
            $VALUES = posOptionArr$values;
            $ENTRIES = b.enumEntries(posOptionArr$values);
        }

        private PosOption(String str, int i10, int i11) {
            this.value = i11;
        }

        public static a getEntries() {
            return $ENTRIES;
        }

        public static PosOption valueOf(String str) {
            return (PosOption) Enum.valueOf(PosOption.class, str);
        }

        public static PosOption[] values() {
            return (PosOption[]) $VALUES.clone();
        }

        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class VideoPlacementOption {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ VideoPlacementOption[] $VALUES;
        private final int value;
        public static final VideoPlacementOption NO_VALUE = new VideoPlacementOption("NO_VALUE", 0, -1);
        public static final VideoPlacementOption INSTREAM = new VideoPlacementOption("INSTREAM", 1, 1);
        public static final VideoPlacementOption IN_BANNER = new VideoPlacementOption("IN_BANNER", 2, 2);
        public static final VideoPlacementOption IN_ARTICLE = new VideoPlacementOption("IN_ARTICLE", 3, 3);
        public static final VideoPlacementOption IN_FEED = new VideoPlacementOption("IN_FEED", 4, 4);
        public static final VideoPlacementOption INTERSTITIAL = new VideoPlacementOption("INTERSTITIAL", 5, 5);
        public static final VideoPlacementOption SLIDER = new VideoPlacementOption("SLIDER", 6, 5);
        public static final VideoPlacementOption FLOATING = new VideoPlacementOption("FLOATING", 7, 5);
        public static final VideoPlacementOption REWARDED = new VideoPlacementOption("REWARDED", 8, 501);

        private static final /* synthetic */ VideoPlacementOption[] $values() {
            return new VideoPlacementOption[]{NO_VALUE, INSTREAM, IN_BANNER, IN_ARTICLE, IN_FEED, INTERSTITIAL, SLIDER, FLOATING, REWARDED};
        }

        static {
            VideoPlacementOption[] videoPlacementOptionArr$values = $values();
            $VALUES = videoPlacementOptionArr$values;
            $ENTRIES = b.enumEntries(videoPlacementOptionArr$values);
        }

        private VideoPlacementOption(String str, int i10, int i11) {
            this.value = i11;
        }

        public static a getEntries() {
            return $ENTRIES;
        }

        public static VideoPlacementOption valueOf(String str) {
            return (VideoPlacementOption) Enum.valueOf(VideoPlacementOption.class, str);
        }

        public static VideoPlacementOption[] values() {
            return (VideoPlacementOption[]) $VALUES.clone();
        }

        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class VideoPlcmtOption {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ VideoPlcmtOption[] $VALUES;
        private final int value;
        public static final VideoPlcmtOption NO_VALUE = new VideoPlcmtOption("NO_VALUE", 0, -1);
        public static final VideoPlcmtOption INSTREAM = new VideoPlcmtOption("INSTREAM", 1, 1);
        public static final VideoPlcmtOption ACCOMPANYING_CONTENT = new VideoPlcmtOption("ACCOMPANYING_CONTENT", 2, 2);
        public static final VideoPlcmtOption INTERSTITIAL = new VideoPlcmtOption("INTERSTITIAL", 3, 3);
        public static final VideoPlcmtOption NO_CONTENT = new VideoPlcmtOption("NO_CONTENT", 4, 4);
        public static final VideoPlcmtOption STANDALONE = new VideoPlcmtOption("STANDALONE", 5, 4);
        public static final VideoPlcmtOption REWARDED = new VideoPlcmtOption("REWARDED", 6, 501);

        private static final /* synthetic */ VideoPlcmtOption[] $values() {
            return new VideoPlcmtOption[]{NO_VALUE, INSTREAM, ACCOMPANYING_CONTENT, INTERSTITIAL, NO_CONTENT, STANDALONE, REWARDED};
        }

        static {
            VideoPlcmtOption[] videoPlcmtOptionArr$values = $values();
            $VALUES = videoPlcmtOptionArr$values;
            $ENTRIES = b.enumEntries(videoPlcmtOptionArr$values);
        }

        private VideoPlcmtOption(String str, int i10, int i11) {
            this.value = i11;
        }

        public static a getEntries() {
            return $ENTRIES;
        }

        public static VideoPlcmtOption valueOf(String str) {
            return (VideoPlcmtOption) Enum.valueOf(VideoPlcmtOption.class, str);
        }

        public static VideoPlcmtOption[] values() {
            return (VideoPlcmtOption[]) $VALUES.clone();
        }

        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class VideoStartDelayOption {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ VideoStartDelayOption[] $VALUES;
        private final int value;
        public static final VideoStartDelayOption NO_VALUE = new VideoStartDelayOption("NO_VALUE", 0, -3);
        public static final VideoStartDelayOption POST_ROLL = new VideoStartDelayOption("POST_ROLL", 1, -2);
        public static final VideoStartDelayOption MID_ROLL = new VideoStartDelayOption("MID_ROLL", 2, -1);
        public static final VideoStartDelayOption PRE_ROLL = new VideoStartDelayOption("PRE_ROLL", 3, 0);

        private static final /* synthetic */ VideoStartDelayOption[] $values() {
            return new VideoStartDelayOption[]{NO_VALUE, POST_ROLL, MID_ROLL, PRE_ROLL};
        }

        static {
            VideoStartDelayOption[] videoStartDelayOptionArr$values = $values();
            $VALUES = videoStartDelayOptionArr$values;
            $ENTRIES = b.enumEntries(videoStartDelayOptionArr$values);
        }

        private VideoStartDelayOption(String str, int i10, int i11) {
            this.value = i11;
        }

        public static a getEntries() {
            return $ENTRIES;
        }

        public static VideoStartDelayOption valueOf(String str) {
            return (VideoStartDelayOption) Enum.valueOf(VideoStartDelayOption.class, str);
        }

        public static VideoStartDelayOption[] values() {
            return (VideoStartDelayOption[]) $VALUES.clone();
        }

        public final int getValue() {
            return this.value;
        }
    }

    public final PosOption getPos() {
        return this.pos;
    }

    public final VideoPlacementOption getVideoPlacement() {
        return this.videoPlacement;
    }

    public final VideoPlcmtOption getVideoPlcmt() {
        return this.videoPlcmt;
    }

    public final JSONObject getVideoSlotExtraJSON() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            VideoStartDelayOption videoStartDelayOption = this.videoStartDelay;
            if (videoStartDelayOption != VideoStartDelayOption.NO_VALUE) {
                jSONObject.put("startdelay", videoStartDelayOption.getValue());
            }
            VideoPlcmtOption videoPlcmtOption = this.videoPlcmt;
            if (videoPlcmtOption != VideoPlcmtOption.NO_VALUE) {
                jSONObject.put("plcmt", videoPlcmtOption.getValue());
            }
            VideoPlacementOption videoPlacementOption = this.videoPlacement;
            if (videoPlacementOption != VideoPlacementOption.NO_VALUE) {
                jSONObject.put("placement", videoPlacementOption.getValue());
            }
            if (jSONObject.length() > 0) {
                return jSONObject;
            }
            return null;
        } catch (Exception unused) {
            DtbLog.warn("APSSlotInfoExtra", "Error constructing extra slot info json");
            return null;
        }
    }

    public final VideoStartDelayOption getVideoStartDelay() {
        return this.videoStartDelay;
    }

    public final void setPos(PosOption posOption) {
        e0.checkNotNullParameter(posOption, "<set-?>");
        this.pos = posOption;
    }

    public final void setVideoPlacement(VideoPlacementOption videoPlacementOption) {
        e0.checkNotNullParameter(videoPlacementOption, "<set-?>");
        this.videoPlacement = videoPlacementOption;
    }

    public final void setVideoPlcmt(VideoPlcmtOption videoPlcmtOption) {
        e0.checkNotNullParameter(videoPlcmtOption, "<set-?>");
        this.videoPlcmt = videoPlcmtOption;
    }

    public final void setVideoStartDelay(VideoStartDelayOption videoStartDelayOption) {
        e0.checkNotNullParameter(videoStartDelayOption, "<set-?>");
        this.videoStartDelay = videoStartDelayOption;
    }
}
