package com.sfbx.appconsentv3.ui.viewmodel;

import androidx.lifecycle.g3;
import com.sfbx.appconsent.core.AppConsentCore;
import com.sfbx.appconsent.core.model.reducer.action.Track;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class AbstractTrackingViewModel extends g3 {
    private final AppConsentCore appConsentCore;

    public AbstractTrackingViewModel(AppConsentCore appConsentCore) {
        e0.checkNotNullParameter(appConsentCore, "appConsentCore");
        this.appConsentCore = appConsentCore;
    }

    public final AppConsentCore getAppConsentCore() {
        return this.appConsentCore;
    }

    public final void sendAcceptAllTrackingEvent() {
        this.appConsentCore.sendNewTracking(Track.TrackingValue.buildTrackingEventWithSpecificLayerNumber(new Track(Track.TRACK_LAYERN_CLICK_AA), "1"));
    }

    public final void sendClickAffineByPartnersTrackEvent() {
        this.appConsentCore.sendNewTracking(new Track(Track.TRACK_LAYER2_CLICK_RBP));
    }

    public final void sendClickDetailPurposeTrackEvent(int i10) {
        this.appConsentCore.sendNewTracking(Track.TrackingValue.buildTrackingEventWithId(new Track(Track.TRACK_LAYER2_CLICK_P_ID_MI), String.valueOf(i10)));
    }

    public final void sendClickDetailSpecialPurposeTrackEvent(int i10) {
        this.appConsentCore.sendNewTracking(Track.TrackingValue.buildTrackingEventWithId(new Track(Track.TRACK_LAYER2_CLICK_F_ID_MI), String.valueOf(i10)));
    }

    public final void sendClickMandatoryFinalisesTrackEvent() {
        this.appConsentCore.sendNewTracking(new Track(Track.TRACK_LAYER2_CLICK_MP));
    }

    public final void sendClickMandatoryFunctionalitiesTrackEvent() {
        this.appConsentCore.sendNewTracking(new Track(Track.TRACK_LAYER2_CLICK_MF));
    }

    public final void sendClickPartnersTrackEvent() {
        this.appConsentCore.sendNewTracking(new Track(Track.TRACK_LAYER1_CLICK_PARTNERS));
    }

    public final void sendClickSaveTrackEvent() {
        this.appConsentCore.sendNewTracking(new Track(Track.TRACK_LAYER2_CLICK_SAVE));
    }

    public final void sendClickStackTrackEvent(int i10) {
        this.appConsentCore.sendNewTracking(Track.TrackingValue.buildTrackingEventWithId(new Track(Track.TRACK_LAYER2_CLICK_S_ID_MI), String.valueOf(i10)));
    }

    public final void sendCmpDisplayTrackingEvent() {
        this.appConsentCore.sendNewTracking(new Track(Track.TRACK_CMP_DISPLAY));
    }

    public final void sendContinueWithoutAcceptingTrackingEvent() {
        this.appConsentCore.sendNewTracking(new Track(Track.TRACK_LAYER1_CLICK_SKIP));
    }

    public final void sendDenyAllTrackingEvent() {
        this.appConsentCore.sendNewTracking(Track.TrackingValue.buildTrackingEventWithSpecificLayerNumber(new Track(Track.TRACK_LAYERN_CLICK_DA), "1"));
    }

    public final void sendFeatureIntoStackTrackEvent(int i10, int i11) {
        AppConsentCore appConsentCore = this.appConsentCore;
        Track.TrackingValue trackingValue = Track.TrackingValue;
        appConsentCore.sendNewTracking(trackingValue.buildTrackingEventWithFeatureId(trackingValue.buildTrackingEventWithId(new Track(Track.TRACK_LAYER2_S_ID_CLICK_F_FID_MI), String.valueOf(i10)), String.valueOf(i11)));
    }

    public final void sendGoBackTrackEvent() {
        this.appConsentCore.sendNewTracking(new Track(Track.TRACK_LAYER2_CLICK_BACK));
    }

    public final void sendPrivacyCenterDisplayTrackingEvent() {
        this.appConsentCore.sendNewTracking(new Track(Track.TRACK_PRIVACY_CENTER_DISPLAY));
    }

    public final void sendPurposeIntoStackTrackEvent(int i10, int i11) {
        AppConsentCore appConsentCore = this.appConsentCore;
        Track.TrackingValue trackingValue = Track.TrackingValue;
        appConsentCore.sendNewTracking(trackingValue.buildTrackingEventWithPurposeId(trackingValue.buildTrackingEventWithId(new Track(Track.TRACK_LAYER2_S_ID_CLICK_P_PID_MI), String.valueOf(i10)), String.valueOf(i11)));
    }

    public final void sendStackGoBackTrackEvent(int i10) {
        this.appConsentCore.sendNewTracking(Track.TrackingValue.buildTrackingEventWithId(new Track(Track.TRACK_LAYER2_S_ID_CLICK_BACK), String.valueOf(i10)));
    }

    public final void sendSwitchPurposeIsOnOffTrackEvent(int i10, boolean z10) {
        AppConsentCore appConsentCore = this.appConsentCore;
        Track.TrackingValue trackingValue = Track.TrackingValue;
        appConsentCore.sendNewTracking(trackingValue.buildTrackingEventWithOnOffValue(trackingValue.buildTrackingEventWithId(new Track(Track.TRACK_LAYER2_SWITCH_P_ID_ISON), String.valueOf(i10)), z10));
    }

    public final void sendSwitchPurposeObjectIsOnOffTrackEvent(int i10, boolean z10) {
        AppConsentCore appConsentCore = this.appConsentCore;
        Track.TrackingValue trackingValue = Track.TrackingValue;
        appConsentCore.sendNewTracking(trackingValue.buildTrackingEventWithOnOffValue(trackingValue.buildTrackingEventWithId(new Track(Track.TRACK_LAYER2_P_ID_OBJECT_ISON), String.valueOf(i10)), z10));
    }

    public final void sendSwitchSpecialPurposeObjectIsOnOffTrackEvent(int i10, boolean z10) {
        AppConsentCore appConsentCore = this.appConsentCore;
        Track.TrackingValue trackingValue = Track.TrackingValue;
        appConsentCore.sendNewTracking(trackingValue.buildTrackingEventWithOnOffValue(trackingValue.buildTrackingEventWithId(new Track(Track.TRACK_LAYER2_F_ID_OBJECT_ISON), String.valueOf(i10)), z10));
    }

    public final void sendSwitchStackFeatureTrackEvent(int i10, int i11, boolean z10) {
        AppConsentCore appConsentCore = this.appConsentCore;
        Track.TrackingValue trackingValue = Track.TrackingValue;
        appConsentCore.sendNewTracking(trackingValue.buildTrackingEventWithOnOffValue(trackingValue.buildTrackingEventWithFeatureId(trackingValue.buildTrackingEventWithId(new Track(Track.TRACK_LAYER2_S_ID_CLICK_F_FID_ISON), String.valueOf(i10)), String.valueOf(i11)), z10));
    }

    public final void sendSwitchStackIsOnOffTrackEvent(int i10, boolean z10) {
        AppConsentCore appConsentCore = this.appConsentCore;
        Track.TrackingValue trackingValue = Track.TrackingValue;
        appConsentCore.sendNewTracking(trackingValue.buildTrackingEventWithOnOffValue(trackingValue.buildTrackingEventWithId(new Track(Track.TRACK_LAYER2_SWITCH_S_ID_ISON), String.valueOf(i10)), z10));
    }

    public final void sendSwitchStackPurposeTrackEvent(int i10, int i11, boolean z10) {
        AppConsentCore appConsentCore = this.appConsentCore;
        Track.TrackingValue trackingValue = Track.TrackingValue;
        appConsentCore.sendNewTracking(trackingValue.buildTrackingEventWithOnOffValue(trackingValue.buildTrackingEventWithPurposeId(trackingValue.buildTrackingEventWithId(new Track(Track.TRACK_LAYER2_S_ID_CLICK_P_PID_ISON), String.valueOf(i10)), String.valueOf(i11)), z10));
    }
}
