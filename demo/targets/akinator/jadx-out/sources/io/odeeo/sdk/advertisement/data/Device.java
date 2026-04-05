package io.odeeo.sdk.advertisement.data;

import e3.g;
import java.util.List;
import kotlin.jvm.internal.e0;
import lk.c;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class Device {

    @c("audio_input")
    private final List<String> audioInput;

    @c("audio_output")
    private final List<String> audioOutput;

    @c("battery_level")
    private final String batteryLevel;

    @c("battery_state")
    private final String batteryState;

    @c("input_language")
    private final List<String> inputLanguage;
    private final String language;
    private final String manufacturer;
    private final String model;

    @c("network_type")
    private final String networkType;

    @c("operator_name")
    private final String operatorName;
    private final String orientation;

    @c("os_version")
    private final String osVersion;
    private final long timestamp;

    public Device(String language, String manufacturer, String model, String osVersion, String networkType, String str, List<String> audioInput, List<String> audioOutput, List<String> inputLanguage, String orientation, String batteryLevel, String batteryState, long j10) {
        e0.checkNotNullParameter(language, "language");
        e0.checkNotNullParameter(manufacturer, "manufacturer");
        e0.checkNotNullParameter(model, "model");
        e0.checkNotNullParameter(osVersion, "osVersion");
        e0.checkNotNullParameter(networkType, "networkType");
        e0.checkNotNullParameter(audioInput, "audioInput");
        e0.checkNotNullParameter(audioOutput, "audioOutput");
        e0.checkNotNullParameter(inputLanguage, "inputLanguage");
        e0.checkNotNullParameter(orientation, "orientation");
        e0.checkNotNullParameter(batteryLevel, "batteryLevel");
        e0.checkNotNullParameter(batteryState, "batteryState");
        this.language = language;
        this.manufacturer = manufacturer;
        this.model = model;
        this.osVersion = osVersion;
        this.networkType = networkType;
        this.operatorName = str;
        this.audioInput = audioInput;
        this.audioOutput = audioOutput;
        this.inputLanguage = inputLanguage;
        this.orientation = orientation;
        this.batteryLevel = batteryLevel;
        this.batteryState = batteryState;
        this.timestamp = j10;
    }

    public final String component1() {
        return this.language;
    }

    public final String component10() {
        return this.orientation;
    }

    public final String component11() {
        return this.batteryLevel;
    }

    public final String component12() {
        return this.batteryState;
    }

    public final long component13() {
        return this.timestamp;
    }

    public final String component2() {
        return this.manufacturer;
    }

    public final String component3() {
        return this.model;
    }

    public final String component4() {
        return this.osVersion;
    }

    public final String component5() {
        return this.networkType;
    }

    public final String component6() {
        return this.operatorName;
    }

    public final List<String> component7() {
        return this.audioInput;
    }

    public final List<String> component8() {
        return this.audioOutput;
    }

    public final List<String> component9() {
        return this.inputLanguage;
    }

    public final Device copy(String language, String manufacturer, String model, String osVersion, String networkType, String str, List<String> audioInput, List<String> audioOutput, List<String> inputLanguage, String orientation, String batteryLevel, String batteryState, long j10) {
        e0.checkNotNullParameter(language, "language");
        e0.checkNotNullParameter(manufacturer, "manufacturer");
        e0.checkNotNullParameter(model, "model");
        e0.checkNotNullParameter(osVersion, "osVersion");
        e0.checkNotNullParameter(networkType, "networkType");
        e0.checkNotNullParameter(audioInput, "audioInput");
        e0.checkNotNullParameter(audioOutput, "audioOutput");
        e0.checkNotNullParameter(inputLanguage, "inputLanguage");
        e0.checkNotNullParameter(orientation, "orientation");
        e0.checkNotNullParameter(batteryLevel, "batteryLevel");
        e0.checkNotNullParameter(batteryState, "batteryState");
        return new Device(language, manufacturer, model, osVersion, networkType, str, audioInput, audioOutput, inputLanguage, orientation, batteryLevel, batteryState, j10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Device)) {
            return false;
        }
        Device device = (Device) obj;
        return e0.areEqual(this.language, device.language) && e0.areEqual(this.manufacturer, device.manufacturer) && e0.areEqual(this.model, device.model) && e0.areEqual(this.osVersion, device.osVersion) && e0.areEqual(this.networkType, device.networkType) && e0.areEqual(this.operatorName, device.operatorName) && e0.areEqual(this.audioInput, device.audioInput) && e0.areEqual(this.audioOutput, device.audioOutput) && e0.areEqual(this.inputLanguage, device.inputLanguage) && e0.areEqual(this.orientation, device.orientation) && e0.areEqual(this.batteryLevel, device.batteryLevel) && e0.areEqual(this.batteryState, device.batteryState) && this.timestamp == device.timestamp;
    }

    public final List<String> getAudioInput() {
        return this.audioInput;
    }

    public final List<String> getAudioOutput() {
        return this.audioOutput;
    }

    public final String getBatteryLevel() {
        return this.batteryLevel;
    }

    public final String getBatteryState() {
        return this.batteryState;
    }

    public final List<String> getInputLanguage() {
        return this.inputLanguage;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final String getManufacturer() {
        return this.manufacturer;
    }

    public final String getModel() {
        return this.model;
    }

    public final String getNetworkType() {
        return this.networkType;
    }

    public final String getOperatorName() {
        return this.operatorName;
    }

    public final String getOrientation() {
        return this.orientation;
    }

    public final String getOsVersion() {
        return this.osVersion;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int iE = o2.e(o2.e(o2.e(o2.e(this.language.hashCode() * 31, 31, this.manufacturer), 31, this.model), 31, this.osVersion), 31, this.networkType);
        String str = this.operatorName;
        return Long.hashCode(this.timestamp) + o2.e(o2.e(o2.e(j1.o2.c(j1.o2.c(j1.o2.c((iE + (str == null ? 0 : str.hashCode())) * 31, 31, this.audioInput), 31, this.audioOutput), 31, this.inputLanguage), 31, this.orientation), 31, this.batteryLevel), 31, this.batteryState);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Device(language=");
        sb2.append(this.language);
        sb2.append(", manufacturer=");
        sb2.append(this.manufacturer);
        sb2.append(", model=");
        sb2.append(this.model);
        sb2.append(", osVersion=");
        sb2.append(this.osVersion);
        sb2.append(", networkType=");
        sb2.append(this.networkType);
        sb2.append(", operatorName=");
        sb2.append((Object) this.operatorName);
        sb2.append(", audioInput=");
        sb2.append(this.audioInput);
        sb2.append(", audioOutput=");
        sb2.append(this.audioOutput);
        sb2.append(", inputLanguage=");
        sb2.append(this.inputLanguage);
        sb2.append(", orientation=");
        sb2.append(this.orientation);
        sb2.append(", batteryLevel=");
        sb2.append(this.batteryLevel);
        sb2.append(", batteryState=");
        sb2.append(this.batteryState);
        sb2.append(", timestamp=");
        return g.n(sb2, this.timestamp, ')');
    }
}
