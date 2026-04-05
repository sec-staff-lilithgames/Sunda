package com.unity3d.ads.core.data.datasource;

import android.database.ContentObserver;
import android.provider.Settings;
import av.e;
import bv.f;
import bv.n;
import com.unity3d.ads.core.data.datasource.VolumeSettingsChange;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.z0;
import kotlinx.coroutines.channels.ChannelsKt;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kv.a;
import kv.p;
import tu.a0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1", f = "AndroidDynamicDeviceInfoDataSource.kt", i = {}, l = {610}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1 extends n implements p {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AndroidDynamicDeviceInfoDataSource this$0;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f0 implements a {
        final /* synthetic */ AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1$contentObserver$1 $contentObserver;
        final /* synthetic */ AndroidDynamicDeviceInfoDataSource this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AndroidDynamicDeviceInfoDataSource androidDynamicDeviceInfoDataSource, AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1$contentObserver$1 androidDynamicDeviceInfoDataSource$volumeSettingsChange$1$contentObserver$1) {
            super(0);
            this.this$0 = androidDynamicDeviceInfoDataSource;
            this.$contentObserver = androidDynamicDeviceInfoDataSource$volumeSettingsChange$1$contentObserver$1;
        }

        @Override // kv.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m3474invoke();
            return x0.f87415a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m3474invoke() {
            this.this$0.getContext().getContentResolver().unregisterContentObserver(this.$contentObserver);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1(AndroidDynamicDeviceInfoDataSource androidDynamicDeviceInfoDataSource, d<? super AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1> dVar) {
        super(2, dVar);
        this.this$0 = androidDynamicDeviceInfoDataSource;
    }

    @Override // bv.a
    public final d<x0> create(Object obj, d<?> dVar) {
        AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1 androidDynamicDeviceInfoDataSource$volumeSettingsChange$1 = new AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1(this.this$0, dVar);
        androidDynamicDeviceInfoDataSource$volumeSettingsChange$1.L$0 = obj;
        return androidDynamicDeviceInfoDataSource$volumeSettingsChange$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [android.database.ContentObserver, com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1$contentObserver$1] */
    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 == 0) {
            a0.throwOnFailure(obj);
            final ProducerScope producerScope = (ProducerScope) this.L$0;
            final kotlin.jvm.internal.x0 x0Var = new kotlin.jvm.internal.x0();
            double streamVolume = this.this$0.getStreamVolume(3);
            x0Var.f71864b = streamVolume;
            ChannelsKt.trySendBlocking(producerScope, new VolumeSettingsChange.VolumeChange(streamVolume));
            final z0 z0Var = new z0();
            int ringerMode = this.this$0.getRingerMode();
            z0Var.f71866b = ringerMode;
            ChannelsKt.trySendBlocking(producerScope, new VolumeSettingsChange.MuteChange(ringerMode == 0));
            final AndroidDynamicDeviceInfoDataSource androidDynamicDeviceInfoDataSource = this.this$0;
            ?? r42 = new ContentObserver() { // from class: com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1$contentObserver$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(null);
                }

                @Override // android.database.ContentObserver
                public void onChange(boolean z10) {
                    super.onChange(z10);
                    double streamVolume2 = androidDynamicDeviceInfoDataSource.getStreamVolume(3);
                    kotlin.jvm.internal.x0 x0Var2 = x0Var;
                    if (streamVolume2 != x0Var2.f71864b) {
                        x0Var2.f71864b = streamVolume2;
                        ChannelsKt.trySendBlocking(producerScope, new VolumeSettingsChange.VolumeChange(streamVolume2));
                    }
                    int ringerMode2 = androidDynamicDeviceInfoDataSource.getRingerMode();
                    z0 z0Var2 = z0Var;
                    if (ringerMode2 != z0Var2.f71866b) {
                        z0Var2.f71866b = ringerMode2;
                        ChannelsKt.trySendBlocking(producerScope, new VolumeSettingsChange.MuteChange(ringerMode2 == 0));
                    }
                }
            };
            this.this$0.getContext().getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, r42);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, r42);
            this.label = 1;
            if (ProduceKt.awaitClose(producerScope, anonymousClass1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
        }
        return x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(ProducerScope<? super VolumeSettingsChange> producerScope, d<? super x0> dVar) {
        return ((AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1) create(producerScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
