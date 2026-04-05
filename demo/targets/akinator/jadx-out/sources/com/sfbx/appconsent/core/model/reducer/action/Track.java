package com.sfbx.appconsent.core.model.reducer.action;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import p0.o2;
import sv.k0;
import sv.n0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class Track implements Action {
    private static final String AA = "_aa";
    private static final String API = "api";
    private static final String API_US = "api_us";
    private static final String CLICK = "_click";
    private static final String DA = "_da";
    private static final String F_FID = "_f{fid}";
    private static final String F_ID = "_f{id}";
    private static final String IS_ON = "_{isOn}";
    private static final String KEY_FEATURE_ID = "{fid}";
    private static final String KEY_ID = "{id}";
    private static final String KEY_IS_ON = "{isOn}";
    private static final String KEY_LAYER = "{layer}";
    private static final String KEY_PURPOSE_ID = "{pid}";
    private static final String LAYER1_CLICK = "layer1_click";
    private static final String LAYER2_CLICK = "layer2_click";
    private static final String LAYERN_CLICK = "layer{layer}_click";
    private static final String LAYER_1 = "layer1";
    private static final String LAYER_2 = "layer2";
    private static final String LAYER_N = "layer{layer}";
    private static final String MI = "_mi";
    private static final String OBJECT = "_object";
    private static final String P_ID = "_p{id}";
    private static final String P_PID = "_p{pid}";
    private static final String SWITCH = "_switch";
    private static final String S_ID = "_s{id}";
    private static final String US = "_us";
    private static final String VALUE_IS_ON_OFF = "off";
    private static final String VALUE_IS_ON_ON = "on";
    private final String event;
    public static final TrackingValue TrackingValue = new TrackingValue(null);
    public static final String TRACK_CMP_DISPLAY = "cmp_display";
    public static final String TRACK_PRIVACY_CENTER_DISPLAY = "privacy_center_display";
    public static final String TRACK_REACQUIRED_CONSENT = "reacquired_consent";
    public static final String TRACK_WITHDRAW_CONSENT = "withdraw_consent";
    private static final String[] GENERIC_TRACKS = {TRACK_CMP_DISPLAY, TRACK_PRIVACY_CENTER_DISPLAY, TRACK_REACQUIRED_CONSENT, TRACK_WITHDRAW_CONSENT};
    public static final String TRACK_LAYER1_CLICK_PARTNERS = "layer1_click_partners";
    public static final String TRACK_LAYER1_CLICK_PRIVACY_POLICY = "layer1_click_privacy_policy";
    public static final String TRACK_LAYER1_CLICK_SKIP = "layer1_click_skip";
    public static final String TRACK_LAYER1_CLICK_SETTINGS = "layer1_click_settings";
    private static final String[] LAYER1_TRACKS = {TRACK_LAYER1_CLICK_PARTNERS, TRACK_LAYER1_CLICK_PRIVACY_POLICY, TRACK_LAYER1_CLICK_SKIP, TRACK_LAYER1_CLICK_SETTINGS};
    public static final String TRACK_LAYER2_CLICK_MP = "layer2_click_mp";
    public static final String TRACK_LAYER2_CLICK_MF = "layer2_click_mf";
    public static final String TRACK_LAYER2_CLICK_RBP = "layer2_click_rbp";
    public static final String TRACK_LAYER2_CLICK_SAVE = "layer2_click_save";
    public static final String TRACK_LAYER2_CLICK_BACK = "layer2_click_back";
    public static final String TRACK_LAYER2_S_ID_CLICK_BACK = "layer2_s{id}_click_back";
    public static final String TRACK_LAYER2_CLICK_P_ID_MI = "layer2_click_p{id}_mi";
    public static final String TRACK_LAYER2_CLICK_F_ID_MI = "layer2_click_f{id}_mi";
    public static final String TRACK_LAYER2_CLICK_S_ID_MI = "layer2_click_s{id}_mi";
    public static final String TRACK_LAYER2_SWITCH_P_ID_ISON = "layer2_switch_p{id}_{isOn}";
    public static final String TRACK_LAYER2_SWITCH_S_ID_ISON = "layer2_switch_s{id}_{isOn}";
    public static final String TRACK_LAYER2_P_ID_OBJECT_ISON = "layer2_p{id}_object_{isOn}";
    public static final String TRACK_LAYER2_F_ID_OBJECT_ISON = "layer2_f{id}_object_{isOn}";
    public static final String TRACK_LAYER2_S_ID_CLICK_F_FID_MI = "layer2_s{id}_click_f{fid}_mi";
    public static final String TRACK_LAYER2_S_ID_CLICK_F_FID_ISON = "layer2_s{id}_click_f{fid}_{isOn}";
    public static final String TRACK_LAYER2_S_ID_CLICK_P_PID_MI = "layer2_s{id}_click_p{pid}_mi";
    public static final String TRACK_LAYER2_S_ID_CLICK_P_PID_ISON = "layer2_s{id}_click_p{pid}_{isOn}";
    private static final String[] LAYER2_TRACKS = {TRACK_LAYER2_CLICK_MP, TRACK_LAYER2_CLICK_MF, TRACK_LAYER2_CLICK_RBP, TRACK_LAYER2_CLICK_SAVE, TRACK_LAYER2_CLICK_BACK, TRACK_LAYER2_S_ID_CLICK_BACK, TRACK_LAYER2_CLICK_P_ID_MI, TRACK_LAYER2_CLICK_F_ID_MI, TRACK_LAYER2_CLICK_S_ID_MI, TRACK_LAYER2_SWITCH_P_ID_ISON, TRACK_LAYER2_SWITCH_S_ID_ISON, TRACK_LAYER2_P_ID_OBJECT_ISON, TRACK_LAYER2_F_ID_OBJECT_ISON, TRACK_LAYER2_S_ID_CLICK_F_FID_MI, TRACK_LAYER2_S_ID_CLICK_F_FID_ISON, TRACK_LAYER2_S_ID_CLICK_P_PID_MI, TRACK_LAYER2_S_ID_CLICK_P_PID_ISON};
    public static final String TRACK_LAYERN_CLICK_AA = "layer{layer}_click_aa";
    public static final String TRACK_LAYERN_CLICK_DA = "layer{layer}_click_da";
    private static final String[] LAYERN_TRACKS = {TRACK_LAYERN_CLICK_AA, TRACK_LAYERN_CLICK_DA};
    public static final String TRACK_API_AA = "api_aa";
    public static final String TRACK_API_DA = "api_da";
    public static final String TRACK_API_FDA = "api_fda";
    public static final String TRACK_API_US_AA = "api_us_aa";
    public static final String TRACK_API_US_DA = "api_us_da";
    public static final String TRACK_API_US_P12348 = "api_us_p12348";
    private static final String[] API_TRACKS = {TRACK_API_AA, TRACK_API_DA, TRACK_API_FDA, TRACK_API_US_AA, TRACK_API_US_DA, TRACK_API_US_P12348};

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class TrackingValue {
        public /* synthetic */ TrackingValue(u uVar) {
            this();
        }

        public final Track buildTrackingEventWithFeatureId(Track track, String featureId) {
            e0.checkNotNullParameter(track, "<this>");
            e0.checkNotNullParameter(featureId, "featureId");
            return n0.contains$default((CharSequence) track.getEvent(), (CharSequence) Track.KEY_FEATURE_ID, false, 2, (Object) null) ? new Track(k0.replace$default(track.getEvent(), Track.KEY_FEATURE_ID, featureId, false, 4, (Object) null)) : track;
        }

        public final Track buildTrackingEventWithId(Track track, String id2) {
            e0.checkNotNullParameter(track, "<this>");
            e0.checkNotNullParameter(id2, "id");
            return n0.contains$default((CharSequence) track.getEvent(), (CharSequence) Track.KEY_ID, false, 2, (Object) null) ? new Track(k0.replace$default(track.getEvent(), Track.KEY_ID, id2, false, 4, (Object) null)) : track;
        }

        public final Track buildTrackingEventWithOnOffValue(Track track, boolean z10) {
            e0.checkNotNullParameter(track, "<this>");
            if (n0.contains$default((CharSequence) track.getEvent(), (CharSequence) Track.KEY_IS_ON, false, 2, (Object) null)) {
                return new Track(k0.replace$default(track.getEvent(), Track.KEY_IS_ON, z10 ? "on" : "off", false, 4, (Object) null));
            }
            return track;
        }

        public final Track buildTrackingEventWithPurposeId(Track track, String purposeId) {
            e0.checkNotNullParameter(track, "<this>");
            e0.checkNotNullParameter(purposeId, "purposeId");
            return n0.contains$default((CharSequence) track.getEvent(), (CharSequence) Track.KEY_PURPOSE_ID, false, 2, (Object) null) ? new Track(k0.replace$default(track.getEvent(), Track.KEY_PURPOSE_ID, purposeId, false, 4, (Object) null)) : track;
        }

        public final Track buildTrackingEventWithSpecificLayerNumber(Track track, String layerNumber) {
            e0.checkNotNullParameter(track, "<this>");
            e0.checkNotNullParameter(layerNumber, "layerNumber");
            return n0.contains$default((CharSequence) track.getEvent(), (CharSequence) Track.KEY_LAYER, false, 2, (Object) null) ? new Track(k0.replace$default(track.getEvent(), Track.KEY_LAYER, layerNumber, false, 4, (Object) null)) : track;
        }

        public final String[] getAPI_TRACKS() {
            return Track.API_TRACKS;
        }

        public final String[] getGENERIC_TRACKS() {
            return Track.GENERIC_TRACKS;
        }

        public final String[] getLAYER1_TRACKS() {
            return Track.LAYER1_TRACKS;
        }

        public final String[] getLAYER2_TRACKS() {
            return Track.LAYER2_TRACKS;
        }

        public final String[] getLAYERN_TRACKS() {
            return Track.LAYERN_TRACKS;
        }

        private TrackingValue() {
        }

        public static /* synthetic */ void getAPI_TRACKS$annotations() {
        }

        public static /* synthetic */ void getGENERIC_TRACKS$annotations() {
        }

        public static /* synthetic */ void getLAYER1_TRACKS$annotations() {
        }

        public static /* synthetic */ void getLAYER2_TRACKS$annotations() {
        }

        public static /* synthetic */ void getLAYERN_TRACKS$annotations() {
        }
    }

    public Track(String event) {
        e0.checkNotNullParameter(event, "event");
        this.event = event;
    }

    public static /* synthetic */ Track copy$default(Track track, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = track.event;
        }
        return track.copy(str);
    }

    public final String component1() {
        return this.event;
    }

    public final Track copy(String event) {
        e0.checkNotNullParameter(event, "event");
        return new Track(event);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Track) && e0.areEqual(this.event, ((Track) obj).event);
    }

    public final String getEvent() {
        return this.event;
    }

    public int hashCode() {
        return this.event.hashCode();
    }

    public String toString() {
        return o2.q(new StringBuilder("Track(event="), this.event, ')');
    }
}
