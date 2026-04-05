package io.bidmachine;

import android.content.Context;
import android.graphics.Point;
import android.media.AudioManager;
import android.os.Build;
import android.os.SystemClock;
import com.explorestack.protobuf.adcom.ConnectionType;
import com.explorestack.protobuf.adcom.Context;
import com.explorestack.protobuf.adcom.DeviceType;
import com.explorestack.protobuf.adcom.OS;
import io.bidmachine.protobuf.sdk.Device;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class e2 {

    /* renamed from: a, reason: collision with root package name */
    public final w1 f60346a;

    public e2(w1 w1Var) {
        this.f60346a = w1Var;
    }

    public final void a(Context context, final Device.Builder builder, up.d dVar) throws Throwable {
        Boolean boolValueOf;
        n1 n1VarA = n1.a();
        String ifv = n1VarA.f61931n.getIfv();
        Objects.requireNonNull(builder);
        final int i10 = 12;
        nm.j.ifNotEmpty(ifv, new Executable() { // from class: io.bidmachine.d2
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                switch (i10) {
                    case 0:
                        builder.setCpuvendor((String) obj);
                        break;
                    case 1:
                        builder.setGpuname((String) obj);
                        break;
                    case 2:
                        builder.setGpuvendor((String) obj);
                        break;
                    case 3:
                        builder.setCharging(((Boolean) obj).booleanValue());
                        break;
                    case 4:
                        builder.setHeadset(((Boolean) obj).booleanValue());
                        break;
                    case 5:
                        builder.setBatterysaver(((Boolean) obj).booleanValue());
                        break;
                    case 6:
                        builder.setAirplane(((Boolean) obj).booleanValue());
                        break;
                    case 7:
                        builder.setDnd(((Boolean) obj).booleanValue());
                        break;
                    case 8:
                        builder.setDevicename((String) obj);
                        break;
                    case 9:
                        builder.setHeadsetname((String) obj);
                        break;
                    case 10:
                        builder.setTimezone((String) obj);
                        break;
                    case 11:
                        builder.setRingmute(((Boolean) obj).booleanValue());
                        break;
                    case 12:
                        builder.setIfv((String) obj);
                        break;
                    case 13:
                        builder.setTotalmem(((Long) obj).longValue());
                        break;
                    case 14:
                        builder.setFreemem(((Long) obj).longValue());
                        break;
                    default:
                        builder.setCpuname((String) obj);
                        break;
                }
            }
        });
        builder.setBmIfv(n1VarA.d(context));
        Set<String> inputLanguageSet = pr.d.getInputLanguageSet(context);
        if (!inputLanguageSet.isEmpty()) {
            builder.addAllInputlanguage(inputLanguageSet);
        }
        final int i11 = 3;
        nm.j.ifNotNull(pr.d.isCharging(context), new Executable() { // from class: io.bidmachine.d2
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                switch (i11) {
                    case 0:
                        builder.setCpuvendor((String) obj);
                        break;
                    case 1:
                        builder.setGpuname((String) obj);
                        break;
                    case 2:
                        builder.setGpuvendor((String) obj);
                        break;
                    case 3:
                        builder.setCharging(((Boolean) obj).booleanValue());
                        break;
                    case 4:
                        builder.setHeadset(((Boolean) obj).booleanValue());
                        break;
                    case 5:
                        builder.setBatterysaver(((Boolean) obj).booleanValue());
                        break;
                    case 6:
                        builder.setAirplane(((Boolean) obj).booleanValue());
                        break;
                    case 7:
                        builder.setDnd(((Boolean) obj).booleanValue());
                        break;
                    case 8:
                        builder.setDevicename((String) obj);
                        break;
                    case 9:
                        builder.setHeadsetname((String) obj);
                        break;
                    case 10:
                        builder.setTimezone((String) obj);
                        break;
                    case 11:
                        builder.setRingmute(((Boolean) obj).booleanValue());
                        break;
                    case 12:
                        builder.setIfv((String) obj);
                        break;
                    case 13:
                        builder.setTotalmem(((Long) obj).longValue());
                        break;
                    case 14:
                        builder.setFreemem(((Long) obj).longValue());
                        break;
                    default:
                        builder.setCpuname((String) obj);
                        break;
                }
            }
        });
        final int i12 = 4;
        nm.j.ifNotNull(pr.c.isHeadsetConnected(context), new Executable() { // from class: io.bidmachine.d2
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                switch (i12) {
                    case 0:
                        builder.setCpuvendor((String) obj);
                        break;
                    case 1:
                        builder.setGpuname((String) obj);
                        break;
                    case 2:
                        builder.setGpuvendor((String) obj);
                        break;
                    case 3:
                        builder.setCharging(((Boolean) obj).booleanValue());
                        break;
                    case 4:
                        builder.setHeadset(((Boolean) obj).booleanValue());
                        break;
                    case 5:
                        builder.setBatterysaver(((Boolean) obj).booleanValue());
                        break;
                    case 6:
                        builder.setAirplane(((Boolean) obj).booleanValue());
                        break;
                    case 7:
                        builder.setDnd(((Boolean) obj).booleanValue());
                        break;
                    case 8:
                        builder.setDevicename((String) obj);
                        break;
                    case 9:
                        builder.setHeadsetname((String) obj);
                        break;
                    case 10:
                        builder.setTimezone((String) obj);
                        break;
                    case 11:
                        builder.setRingmute(((Boolean) obj).booleanValue());
                        break;
                    case 12:
                        builder.setIfv((String) obj);
                        break;
                    case 13:
                        builder.setTotalmem(((Long) obj).longValue());
                        break;
                    case 14:
                        builder.setFreemem(((Long) obj).longValue());
                        break;
                    default:
                        builder.setCpuname((String) obj);
                        break;
                }
            }
        });
        Double batteryLevel = pr.d.getBatteryLevel(context);
        if (batteryLevel != null) {
            builder.setBatterylevel(batteryLevel.floatValue());
        }
        final int i13 = 5;
        nm.j.ifNotNull(pr.d.isBatterySaverEnabled(context), new Executable() { // from class: io.bidmachine.d2
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                switch (i13) {
                    case 0:
                        builder.setCpuvendor((String) obj);
                        break;
                    case 1:
                        builder.setGpuname((String) obj);
                        break;
                    case 2:
                        builder.setGpuvendor((String) obj);
                        break;
                    case 3:
                        builder.setCharging(((Boolean) obj).booleanValue());
                        break;
                    case 4:
                        builder.setHeadset(((Boolean) obj).booleanValue());
                        break;
                    case 5:
                        builder.setBatterysaver(((Boolean) obj).booleanValue());
                        break;
                    case 6:
                        builder.setAirplane(((Boolean) obj).booleanValue());
                        break;
                    case 7:
                        builder.setDnd(((Boolean) obj).booleanValue());
                        break;
                    case 8:
                        builder.setDevicename((String) obj);
                        break;
                    case 9:
                        builder.setHeadsetname((String) obj);
                        break;
                    case 10:
                        builder.setTimezone((String) obj);
                        break;
                    case 11:
                        builder.setRingmute(((Boolean) obj).booleanValue());
                        break;
                    case 12:
                        builder.setIfv((String) obj);
                        break;
                    case 13:
                        builder.setTotalmem(((Long) obj).longValue());
                        break;
                    case 14:
                        builder.setFreemem(((Long) obj).longValue());
                        break;
                    default:
                        builder.setCpuname((String) obj);
                        break;
                }
            }
        });
        builder.setDarkmode(pr.d.isDarkModeEnabled(context));
        final int i14 = 6;
        nm.j.ifNotNull(pr.d.isAirplaneModeOn(context), new Executable() { // from class: io.bidmachine.d2
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                switch (i14) {
                    case 0:
                        builder.setCpuvendor((String) obj);
                        break;
                    case 1:
                        builder.setGpuname((String) obj);
                        break;
                    case 2:
                        builder.setGpuvendor((String) obj);
                        break;
                    case 3:
                        builder.setCharging(((Boolean) obj).booleanValue());
                        break;
                    case 4:
                        builder.setHeadset(((Boolean) obj).booleanValue());
                        break;
                    case 5:
                        builder.setBatterysaver(((Boolean) obj).booleanValue());
                        break;
                    case 6:
                        builder.setAirplane(((Boolean) obj).booleanValue());
                        break;
                    case 7:
                        builder.setDnd(((Boolean) obj).booleanValue());
                        break;
                    case 8:
                        builder.setDevicename((String) obj);
                        break;
                    case 9:
                        builder.setHeadsetname((String) obj);
                        break;
                    case 10:
                        builder.setTimezone((String) obj);
                        break;
                    case 11:
                        builder.setRingmute(((Boolean) obj).booleanValue());
                        break;
                    case 12:
                        builder.setIfv((String) obj);
                        break;
                    case 13:
                        builder.setTotalmem(((Long) obj).longValue());
                        break;
                    case 14:
                        builder.setFreemem(((Long) obj).longValue());
                        break;
                    default:
                        builder.setCpuname((String) obj);
                        break;
                }
            }
        });
        final int i15 = 7;
        nm.j.ifNotNull(pr.d.isDoNotDisturbOn(context), new Executable() { // from class: io.bidmachine.d2
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                switch (i15) {
                    case 0:
                        builder.setCpuvendor((String) obj);
                        break;
                    case 1:
                        builder.setGpuname((String) obj);
                        break;
                    case 2:
                        builder.setGpuvendor((String) obj);
                        break;
                    case 3:
                        builder.setCharging(((Boolean) obj).booleanValue());
                        break;
                    case 4:
                        builder.setHeadset(((Boolean) obj).booleanValue());
                        break;
                    case 5:
                        builder.setBatterysaver(((Boolean) obj).booleanValue());
                        break;
                    case 6:
                        builder.setAirplane(((Boolean) obj).booleanValue());
                        break;
                    case 7:
                        builder.setDnd(((Boolean) obj).booleanValue());
                        break;
                    case 8:
                        builder.setDevicename((String) obj);
                        break;
                    case 9:
                        builder.setHeadsetname((String) obj);
                        break;
                    case 10:
                        builder.setTimezone((String) obj);
                        break;
                    case 11:
                        builder.setRingmute(((Boolean) obj).booleanValue());
                        break;
                    case 12:
                        builder.setIfv((String) obj);
                        break;
                    case 13:
                        builder.setTotalmem(((Long) obj).longValue());
                        break;
                    case 14:
                        builder.setFreemem(((Long) obj).longValue());
                        break;
                    default:
                        builder.setCpuname((String) obj);
                        break;
                }
            }
        });
        if (((f4) dVar).canSendDeviceInfo()) {
            final int i16 = 8;
            nm.j.ifNotEmpty(pr.d.getDeviceName(context), new Executable() { // from class: io.bidmachine.d2
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    switch (i16) {
                        case 0:
                            builder.setCpuvendor((String) obj);
                            break;
                        case 1:
                            builder.setGpuname((String) obj);
                            break;
                        case 2:
                            builder.setGpuvendor((String) obj);
                            break;
                        case 3:
                            builder.setCharging(((Boolean) obj).booleanValue());
                            break;
                        case 4:
                            builder.setHeadset(((Boolean) obj).booleanValue());
                            break;
                        case 5:
                            builder.setBatterysaver(((Boolean) obj).booleanValue());
                            break;
                        case 6:
                            builder.setAirplane(((Boolean) obj).booleanValue());
                            break;
                        case 7:
                            builder.setDnd(((Boolean) obj).booleanValue());
                            break;
                        case 8:
                            builder.setDevicename((String) obj);
                            break;
                        case 9:
                            builder.setHeadsetname((String) obj);
                            break;
                        case 10:
                            builder.setTimezone((String) obj);
                            break;
                        case 11:
                            builder.setRingmute(((Boolean) obj).booleanValue());
                            break;
                        case 12:
                            builder.setIfv((String) obj);
                            break;
                        case 13:
                            builder.setTotalmem(((Long) obj).longValue());
                            break;
                        case 14:
                            builder.setFreemem(((Long) obj).longValue());
                            break;
                        default:
                            builder.setCpuname((String) obj);
                            break;
                    }
                }
            });
            ConnectionType connectionType = pr.d.getConnectionType(context);
            this.f60346a.getClass();
            Context.Device.Connection.Builder builderNewBuilder = Context.Device.Connection.newBuilder();
            builderNewBuilder.setType(connectionType);
            builderNewBuilder.setVpn(pr.d.getVpnStatus(context));
            builderNewBuilder.setProxy(pr.d.getProxyStatus(context));
            builder.setConnection(builderNewBuilder.build());
        }
        Double screenBrightnessRatio = pr.d.getScreenBrightnessRatio(context);
        if (screenBrightnessRatio != null) {
            builder.setScreenbright(screenBrightnessRatio.floatValue());
        }
        builder.setLastbootup(SystemClock.elapsedRealtime());
        Set<String> connectedHeadsets = pr.c.getConnectedHeadsets(context);
        if (connectedHeadsets != null && !connectedHeadsets.isEmpty()) {
            final int i17 = 9;
            nm.j.ifNotNull(connectedHeadsets.iterator().next(), new Executable() { // from class: io.bidmachine.d2
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    switch (i17) {
                        case 0:
                            builder.setCpuvendor((String) obj);
                            break;
                        case 1:
                            builder.setGpuname((String) obj);
                            break;
                        case 2:
                            builder.setGpuvendor((String) obj);
                            break;
                        case 3:
                            builder.setCharging(((Boolean) obj).booleanValue());
                            break;
                        case 4:
                            builder.setHeadset(((Boolean) obj).booleanValue());
                            break;
                        case 5:
                            builder.setBatterysaver(((Boolean) obj).booleanValue());
                            break;
                        case 6:
                            builder.setAirplane(((Boolean) obj).booleanValue());
                            break;
                        case 7:
                            builder.setDnd(((Boolean) obj).booleanValue());
                            break;
                        case 8:
                            builder.setDevicename((String) obj);
                            break;
                        case 9:
                            builder.setHeadsetname((String) obj);
                            break;
                        case 10:
                            builder.setTimezone((String) obj);
                            break;
                        case 11:
                            builder.setRingmute(((Boolean) obj).booleanValue());
                            break;
                        case 12:
                            builder.setIfv((String) obj);
                            break;
                        case 13:
                            builder.setTotalmem(((Long) obj).longValue());
                            break;
                        case 14:
                            builder.setFreemem(((Long) obj).longValue());
                            break;
                        default:
                            builder.setCpuname((String) obj);
                            break;
                    }
                }
            });
        }
        builder.setApilevel(Build.VERSION.SDK_INT);
        builder.setTime(nm.h.currentTimeMillis());
        final int i18 = 10;
        nm.j.ifNotEmpty(nm.h.getTimezoneId(), new Executable() { // from class: io.bidmachine.d2
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                switch (i18) {
                    case 0:
                        builder.setCpuvendor((String) obj);
                        break;
                    case 1:
                        builder.setGpuname((String) obj);
                        break;
                    case 2:
                        builder.setGpuvendor((String) obj);
                        break;
                    case 3:
                        builder.setCharging(((Boolean) obj).booleanValue());
                        break;
                    case 4:
                        builder.setHeadset(((Boolean) obj).booleanValue());
                        break;
                    case 5:
                        builder.setBatterysaver(((Boolean) obj).booleanValue());
                        break;
                    case 6:
                        builder.setAirplane(((Boolean) obj).booleanValue());
                        break;
                    case 7:
                        builder.setDnd(((Boolean) obj).booleanValue());
                        break;
                    case 8:
                        builder.setDevicename((String) obj);
                        break;
                    case 9:
                        builder.setHeadsetname((String) obj);
                        break;
                    case 10:
                        builder.setTimezone((String) obj);
                        break;
                    case 11:
                        builder.setRingmute(((Boolean) obj).booleanValue());
                        break;
                    case 12:
                        builder.setIfv((String) obj);
                        break;
                    case 13:
                        builder.setTotalmem(((Long) obj).longValue());
                        break;
                    case 14:
                        builder.setFreemem(((Long) obj).longValue());
                        break;
                    default:
                        builder.setCpuname((String) obj);
                        break;
                }
            }
        });
        DeviceInfo deviceInfoObtain = DeviceInfo.obtain(context);
        if (deviceInfoObtain.getAvailableDiskSpaceInMB() != null) {
            builder.setDiskspace(r0.intValue());
        }
        if (deviceInfoObtain.getTotalDiskSpaceInMB() != null) {
            builder.setTotaldisk(r0.intValue());
        }
        builder.setJailbreak(deviceInfoObtain.isDeviceRooted());
        deviceInfoObtain.getAudio().getClass();
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            boolValueOf = null;
        } else {
            int ringerMode = audioManager.getRingerMode();
            boolean z10 = true;
            if (ringerMode != 0 && ringerMode != 1) {
                z10 = false;
            }
            boolValueOf = Boolean.valueOf(z10);
        }
        final int i19 = 11;
        nm.j.ifNotNull(boolValueOf, new Executable() { // from class: io.bidmachine.d2
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                switch (i19) {
                    case 0:
                        builder.setCpuvendor((String) obj);
                        break;
                    case 1:
                        builder.setGpuname((String) obj);
                        break;
                    case 2:
                        builder.setGpuvendor((String) obj);
                        break;
                    case 3:
                        builder.setCharging(((Boolean) obj).booleanValue());
                        break;
                    case 4:
                        builder.setHeadset(((Boolean) obj).booleanValue());
                        break;
                    case 5:
                        builder.setBatterysaver(((Boolean) obj).booleanValue());
                        break;
                    case 6:
                        builder.setAirplane(((Boolean) obj).booleanValue());
                        break;
                    case 7:
                        builder.setDnd(((Boolean) obj).booleanValue());
                        break;
                    case 8:
                        builder.setDevicename((String) obj);
                        break;
                    case 9:
                        builder.setHeadsetname((String) obj);
                        break;
                    case 10:
                        builder.setTimezone((String) obj);
                        break;
                    case 11:
                        builder.setRingmute(((Boolean) obj).booleanValue());
                        break;
                    case 12:
                        builder.setIfv((String) obj);
                        break;
                    case 13:
                        builder.setTotalmem(((Long) obj).longValue());
                        break;
                    case 14:
                        builder.setFreemem(((Long) obj).longValue());
                        break;
                    default:
                        builder.setCpuname((String) obj);
                        break;
                }
            }
        });
        deviceInfoObtain.getAudio().getClass();
        Float fA = x1.a(context);
        if (fA != null) {
            builder.setAudioContext(Context.Device.AudioContext.newBuilder().setVolumelevel(fA.floatValue()).build());
        }
        deviceInfoObtain.updateHwInfo(context);
        final int i20 = 13;
        nm.j.ifNotNull(deviceInfoObtain.getRam().f59837a, new Executable() { // from class: io.bidmachine.d2
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                switch (i20) {
                    case 0:
                        builder.setCpuvendor((String) obj);
                        break;
                    case 1:
                        builder.setGpuname((String) obj);
                        break;
                    case 2:
                        builder.setGpuvendor((String) obj);
                        break;
                    case 3:
                        builder.setCharging(((Boolean) obj).booleanValue());
                        break;
                    case 4:
                        builder.setHeadset(((Boolean) obj).booleanValue());
                        break;
                    case 5:
                        builder.setBatterysaver(((Boolean) obj).booleanValue());
                        break;
                    case 6:
                        builder.setAirplane(((Boolean) obj).booleanValue());
                        break;
                    case 7:
                        builder.setDnd(((Boolean) obj).booleanValue());
                        break;
                    case 8:
                        builder.setDevicename((String) obj);
                        break;
                    case 9:
                        builder.setHeadsetname((String) obj);
                        break;
                    case 10:
                        builder.setTimezone((String) obj);
                        break;
                    case 11:
                        builder.setRingmute(((Boolean) obj).booleanValue());
                        break;
                    case 12:
                        builder.setIfv((String) obj);
                        break;
                    case 13:
                        builder.setTotalmem(((Long) obj).longValue());
                        break;
                    case 14:
                        builder.setFreemem(((Long) obj).longValue());
                        break;
                    default:
                        builder.setCpuname((String) obj);
                        break;
                }
            }
        });
        final int i21 = 14;
        nm.j.ifNotNull(deviceInfoObtain.getRam().f59838b, new Executable() { // from class: io.bidmachine.d2
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                switch (i21) {
                    case 0:
                        builder.setCpuvendor((String) obj);
                        break;
                    case 1:
                        builder.setGpuname((String) obj);
                        break;
                    case 2:
                        builder.setGpuvendor((String) obj);
                        break;
                    case 3:
                        builder.setCharging(((Boolean) obj).booleanValue());
                        break;
                    case 4:
                        builder.setHeadset(((Boolean) obj).booleanValue());
                        break;
                    case 5:
                        builder.setBatterysaver(((Boolean) obj).booleanValue());
                        break;
                    case 6:
                        builder.setAirplane(((Boolean) obj).booleanValue());
                        break;
                    case 7:
                        builder.setDnd(((Boolean) obj).booleanValue());
                        break;
                    case 8:
                        builder.setDevicename((String) obj);
                        break;
                    case 9:
                        builder.setHeadsetname((String) obj);
                        break;
                    case 10:
                        builder.setTimezone((String) obj);
                        break;
                    case 11:
                        builder.setRingmute(((Boolean) obj).booleanValue());
                        break;
                    case 12:
                        builder.setIfv((String) obj);
                        break;
                    case 13:
                        builder.setTotalmem(((Long) obj).longValue());
                        break;
                    case 14:
                        builder.setFreemem(((Long) obj).longValue());
                        break;
                    default:
                        builder.setCpuname((String) obj);
                        break;
                }
            }
        });
        final int i22 = 15;
        nm.j.ifNotEmpty(deviceInfoObtain.getCpu().f62049b, new Executable() { // from class: io.bidmachine.d2
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                switch (i22) {
                    case 0:
                        builder.setCpuvendor((String) obj);
                        break;
                    case 1:
                        builder.setGpuname((String) obj);
                        break;
                    case 2:
                        builder.setGpuvendor((String) obj);
                        break;
                    case 3:
                        builder.setCharging(((Boolean) obj).booleanValue());
                        break;
                    case 4:
                        builder.setHeadset(((Boolean) obj).booleanValue());
                        break;
                    case 5:
                        builder.setBatterysaver(((Boolean) obj).booleanValue());
                        break;
                    case 6:
                        builder.setAirplane(((Boolean) obj).booleanValue());
                        break;
                    case 7:
                        builder.setDnd(((Boolean) obj).booleanValue());
                        break;
                    case 8:
                        builder.setDevicename((String) obj);
                        break;
                    case 9:
                        builder.setHeadsetname((String) obj);
                        break;
                    case 10:
                        builder.setTimezone((String) obj);
                        break;
                    case 11:
                        builder.setRingmute(((Boolean) obj).booleanValue());
                        break;
                    case 12:
                        builder.setIfv((String) obj);
                        break;
                    case 13:
                        builder.setTotalmem(((Long) obj).longValue());
                        break;
                    case 14:
                        builder.setFreemem(((Long) obj).longValue());
                        break;
                    default:
                        builder.setCpuname((String) obj);
                        break;
                }
            }
        });
        final int i23 = 0;
        nm.j.ifNotEmpty(deviceInfoObtain.getCpu().f62050c, new Executable() { // from class: io.bidmachine.d2
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                switch (i23) {
                    case 0:
                        builder.setCpuvendor((String) obj);
                        break;
                    case 1:
                        builder.setGpuname((String) obj);
                        break;
                    case 2:
                        builder.setGpuvendor((String) obj);
                        break;
                    case 3:
                        builder.setCharging(((Boolean) obj).booleanValue());
                        break;
                    case 4:
                        builder.setHeadset(((Boolean) obj).booleanValue());
                        break;
                    case 5:
                        builder.setBatterysaver(((Boolean) obj).booleanValue());
                        break;
                    case 6:
                        builder.setAirplane(((Boolean) obj).booleanValue());
                        break;
                    case 7:
                        builder.setDnd(((Boolean) obj).booleanValue());
                        break;
                    case 8:
                        builder.setDevicename((String) obj);
                        break;
                    case 9:
                        builder.setHeadsetname((String) obj);
                        break;
                    case 10:
                        builder.setTimezone((String) obj);
                        break;
                    case 11:
                        builder.setRingmute(((Boolean) obj).booleanValue());
                        break;
                    case 12:
                        builder.setIfv((String) obj);
                        break;
                    case 13:
                        builder.setTotalmem(((Long) obj).longValue());
                        break;
                    case 14:
                        builder.setFreemem(((Long) obj).longValue());
                        break;
                    default:
                        builder.setCpuname((String) obj);
                        break;
                }
            }
        });
        final int i24 = 1;
        nm.j.ifNotEmpty(deviceInfoObtain.getGpu().f62071b, new Executable() { // from class: io.bidmachine.d2
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                switch (i24) {
                    case 0:
                        builder.setCpuvendor((String) obj);
                        break;
                    case 1:
                        builder.setGpuname((String) obj);
                        break;
                    case 2:
                        builder.setGpuvendor((String) obj);
                        break;
                    case 3:
                        builder.setCharging(((Boolean) obj).booleanValue());
                        break;
                    case 4:
                        builder.setHeadset(((Boolean) obj).booleanValue());
                        break;
                    case 5:
                        builder.setBatterysaver(((Boolean) obj).booleanValue());
                        break;
                    case 6:
                        builder.setAirplane(((Boolean) obj).booleanValue());
                        break;
                    case 7:
                        builder.setDnd(((Boolean) obj).booleanValue());
                        break;
                    case 8:
                        builder.setDevicename((String) obj);
                        break;
                    case 9:
                        builder.setHeadsetname((String) obj);
                        break;
                    case 10:
                        builder.setTimezone((String) obj);
                        break;
                    case 11:
                        builder.setRingmute(((Boolean) obj).booleanValue());
                        break;
                    case 12:
                        builder.setIfv((String) obj);
                        break;
                    case 13:
                        builder.setTotalmem(((Long) obj).longValue());
                        break;
                    case 14:
                        builder.setFreemem(((Long) obj).longValue());
                        break;
                    default:
                        builder.setCpuname((String) obj);
                        break;
                }
            }
        });
        final int i25 = 2;
        nm.j.ifNotEmpty(deviceInfoObtain.getGpu().f62072c, new Executable() { // from class: io.bidmachine.d2
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                switch (i25) {
                    case 0:
                        builder.setCpuvendor((String) obj);
                        break;
                    case 1:
                        builder.setGpuname((String) obj);
                        break;
                    case 2:
                        builder.setGpuvendor((String) obj);
                        break;
                    case 3:
                        builder.setCharging(((Boolean) obj).booleanValue());
                        break;
                    case 4:
                        builder.setHeadset(((Boolean) obj).booleanValue());
                        break;
                    case 5:
                        builder.setBatterysaver(((Boolean) obj).booleanValue());
                        break;
                    case 6:
                        builder.setAirplane(((Boolean) obj).booleanValue());
                        break;
                    case 7:
                        builder.setDnd(((Boolean) obj).booleanValue());
                        break;
                    case 8:
                        builder.setDevicename((String) obj);
                        break;
                    case 9:
                        builder.setHeadsetname((String) obj);
                        break;
                    case 10:
                        builder.setTimezone((String) obj);
                        break;
                    case 11:
                        builder.setRingmute(((Boolean) obj).booleanValue());
                        break;
                    case 12:
                        builder.setIfv((String) obj);
                        break;
                    case 13:
                        builder.setTotalmem(((Long) obj).longValue());
                        break;
                    case 14:
                        builder.setFreemem(((Long) obj).longValue());
                        break;
                    default:
                        builder.setCpuname((String) obj);
                        break;
                }
            }
        });
    }

    public final void b(android.content.Context context, final Context.Device.Builder builder, TargetingParams targetingParams, TargetingParams targetingParams2, f4 f4Var, ConnectionType connectionType) {
        DeviceInfo deviceInfoObtain = DeviceInfo.obtain(context);
        builder.setType(deviceInfoObtain.isTablet ? DeviceType.DEVICE_TYPE_TABLET : DeviceType.DEVICE_TYPE_PHONE_DEVICE);
        builder.setOs(OS.OS_ANDROID);
        builder.setOsv(pr.d.getOsVersion());
        builder.setPxratio(deviceInfoObtain.screenDensity);
        builder.setPpi(deviceInfoObtain.screenDpi);
        Point screenSize = nm.j.getScreenSize(context);
        builder.setW(screenSize.x);
        builder.setH(screenSize.y);
        builder.setIfa(d0.a(context, !f4Var.canSendIfa()));
        AdvertisingDataManager$AdvertisingData advertisingDataManager$AdvertisingData = d0.f60333d;
        builder.setLmt(advertisingDataManager$AdvertisingData != null && advertisingDataManager$AdvertisingData.isLimitAdTrackingEnabled());
        if (f4Var.canSendDeviceInfo()) {
            if (connectionType == null) {
                connectionType = pr.d.getConnectionType(context);
            }
            builder.setContype(connectionType);
            builder.setMake(pr.d.getManufacturer());
            final int i10 = 0;
            nm.j.ifNotEmpty(UserAgentManager.getUserAgent(context), new Executable() { // from class: io.bidmachine.c2
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    switch (i10) {
                        case 0:
                            builder.setUa((String) obj);
                            break;
                        case 1:
                            builder.setModel((String) obj);
                            break;
                        case 2:
                            builder.setHwv((String) obj);
                            break;
                        case 3:
                            builder.setLang((String) obj);
                            break;
                        case 4:
                            builder.setMccmnc((String) obj);
                            break;
                        default:
                            builder.setCarrier((String) obj);
                            break;
                    }
                }
            });
            final int i11 = 1;
            nm.j.ifNotNull(deviceInfoObtain.model, new Executable() { // from class: io.bidmachine.c2
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    switch (i11) {
                        case 0:
                            builder.setUa((String) obj);
                            break;
                        case 1:
                            builder.setModel((String) obj);
                            break;
                        case 2:
                            builder.setHwv((String) obj);
                            break;
                        case 3:
                            builder.setLang((String) obj);
                            break;
                        case 4:
                            builder.setMccmnc((String) obj);
                            break;
                        default:
                            builder.setCarrier((String) obj);
                            break;
                    }
                }
            });
            final int i12 = 2;
            nm.j.ifNotNull(deviceInfoObtain.getHWV(), new Executable() { // from class: io.bidmachine.c2
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    switch (i12) {
                        case 0:
                            builder.setUa((String) obj);
                            break;
                        case 1:
                            builder.setModel((String) obj);
                            break;
                        case 2:
                            builder.setHwv((String) obj);
                            break;
                        case 3:
                            builder.setLang((String) obj);
                            break;
                        case 4:
                            builder.setMccmnc((String) obj);
                            break;
                        default:
                            builder.setCarrier((String) obj);
                            break;
                    }
                }
            });
            final int i13 = 3;
            nm.j.ifNotEmpty(Locale.getDefault().getLanguage(), new Executable() { // from class: io.bidmachine.c2
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    switch (i13) {
                        case 0:
                            builder.setUa((String) obj);
                            break;
                        case 1:
                            builder.setModel((String) obj);
                            break;
                        case 2:
                            builder.setHwv((String) obj);
                            break;
                        case 3:
                            builder.setLang((String) obj);
                            break;
                        case 4:
                            builder.setMccmnc((String) obj);
                            break;
                        default:
                            builder.setCarrier((String) obj);
                            break;
                    }
                }
            });
            final int i14 = 4;
            nm.j.ifNotEmpty(deviceInfoObtain.phoneMCCMNC, new Executable() { // from class: io.bidmachine.c2
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    switch (i14) {
                        case 0:
                            builder.setUa((String) obj);
                            break;
                        case 1:
                            builder.setModel((String) obj);
                            break;
                        case 2:
                            builder.setHwv((String) obj);
                            break;
                        case 3:
                            builder.setLang((String) obj);
                            break;
                        case 4:
                            builder.setMccmnc((String) obj);
                            break;
                        default:
                            builder.setCarrier((String) obj);
                            break;
                    }
                }
            });
            final int i15 = 5;
            nm.j.ifNotEmpty(deviceInfoObtain.phoneCarrier, new Executable() { // from class: io.bidmachine.c2
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    switch (i15) {
                        case 0:
                            builder.setUa((String) obj);
                            break;
                        case 1:
                            builder.setModel((String) obj);
                            break;
                        case 2:
                            builder.setHwv((String) obj);
                            break;
                        case 3:
                            builder.setLang((String) obj);
                            break;
                        case 4:
                            builder.setMccmnc((String) obj);
                            break;
                        default:
                            builder.setCarrier((String) obj);
                            break;
                    }
                }
            });
            this.f60346a.getClass();
            Context.Device.Connection.Builder builderNewBuilder = Context.Device.Connection.newBuilder();
            builderNewBuilder.setType(connectionType);
            builderNewBuilder.setVpn(pr.d.getVpnStatus(context));
            builderNewBuilder.setProxy(pr.d.getProxyStatus(context));
            builder.setConnection(builderNewBuilder.build());
        }
        if (f4Var.canSendGeoPosition()) {
            builder.setGeo(pr.i.createGeoBuilderWithLocation(context, targetingParams.getDeviceLocation(), targetingParams2.getDeviceLocation(), true));
        }
    }
}
