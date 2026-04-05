package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.adcom.Context;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface DeviceOrBuilder extends MessageOrBuilder {
    String getAccess();

    ByteString getAccessBytes();

    boolean getAirplane();

    int getApilevel();

    int getAtts();

    Context.Device.AudioContext getAudioContext();

    Context.Device.AudioContextOrBuilder getAudioContextOrBuilder();

    float getBatterylevel();

    boolean getBatterysaver();

    String getBmIfv();

    ByteString getBmIfvBytes();

    boolean getCharging();

    Context.Device.Connection getConnection();

    Context.Device.ConnectionOrBuilder getConnectionOrBuilder();

    String getCpuname();

    ByteString getCpunameBytes();

    String getCpuvendor();

    ByteString getCpuvendorBytes();

    boolean getDarkmode();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ MessageLite getDefaultInstanceForType();

    String getDevicename();

    ByteString getDevicenameBytes();

    long getDiskspace();

    boolean getDnd();

    long getFreemem();

    String getGpuname();

    ByteString getGpunameBytes();

    String getGpuvendor();

    ByteString getGpuvendorBytes();

    boolean getHeadset();

    String getHeadsetname();

    ByteString getHeadsetnameBytes();

    String getIfv();

    ByteString getIfvBytes();

    String getInputlanguage(int i10);

    ByteString getInputlanguageBytes(int i10);

    int getInputlanguageCount();

    List<String> getInputlanguageList();

    boolean getJailbreak();

    long getLastbootup();

    boolean getRingmute();

    float getScreenbright();

    long getTime();

    String getTimezone();

    ByteString getTimezoneBytes();

    long getTotaldisk();

    long getTotalmem();

    boolean hasAudioContext();

    boolean hasConnection();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
