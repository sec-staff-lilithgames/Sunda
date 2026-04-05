package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdur {
    public static final zzgpe zza;
    public static final zzgpe zzb;
    private final String zzc;
    private final zzduq zzd;
    private final zzduq zze;

    static {
        zzduq zzduqVar = zzduq.PUBLIC_API_CALL;
        zzduq zzduqVar2 = zzduq.PUBLIC_API_CALLBACK;
        zzdur zzdurVar = new zzdur("tqgt", zzduqVar, zzduqVar2);
        zzduq zzduqVar3 = zzduq.DYNAMITE_ENTER;
        zzdur zzdurVar2 = new zzdur("l.dl", zzduqVar, zzduqVar3);
        zzduq zzduqVar4 = zzduq.READ_FROM_DISK_START;
        zzdur zzdurVar3 = new zzdur("l.rccde", zzduqVar3, zzduqVar4);
        zzdur zzdurVar4 = new zzdur("l.rfd", zzduqVar4, zzduq.READ_FROM_DISK_END);
        zzduq zzduqVar5 = zzduq.CLIENT_SIGNALS_START;
        zzdur zzdurVar5 = new zzdur("l.rcc", zzduqVar3, zzduqVar5);
        zzduq zzduqVar6 = zzduq.CLIENT_SIGNALS_END;
        zzdur zzdurVar6 = new zzdur("l.cs", zzduqVar5, zzduqVar6);
        zzduq zzduqVar7 = zzduq.SERVICE_CONNECTED;
        zzdur zzdurVar7 = new zzdur("l.cts", zzduqVar6, zzduqVar7);
        zzduq zzduqVar8 = zzduq.GMS_SIGNALS_START;
        zzduq zzduqVar9 = zzduq.GMS_SIGNALS_END;
        zzdur zzdurVar8 = new zzdur("l.gs", zzduqVar8, zzduqVar9);
        zzduq zzduqVar10 = zzduq.GET_SIGNALS_SDKCORE_START;
        zzdur zzdurVar9 = new zzdur("l.jse", zzduqVar9, zzduqVar10);
        zzduq zzduqVar11 = zzduq.GET_SIGNALS_SDKCORE_END;
        zzdur zzdurVar10 = new zzdur("l.gs-sdkcore", zzduqVar10, zzduqVar11);
        zzdur zzdurVar11 = new zzdur("l.gs-pp", zzduqVar11, zzduqVar2);
        zzduq zzduqVar12 = zzduq.RENDERING_START;
        zzdur zzdurVar12 = new zzdur("l.render", zzduqVar12, zzduqVar2);
        zzduq zzduqVar13 = zzduq.RENDERING_WEBVIEW_CREATION_START;
        zzdur zzdurVar13 = new zzdur("l.render.pre", zzduqVar12, zzduqVar13);
        zzduq zzduqVar14 = zzduq.RENDERING_WEBVIEW_CREATION_END;
        zzdur zzdurVar14 = new zzdur("l.render.wvc", zzduqVar13, zzduqVar14);
        zzduq zzduqVar15 = zzduq.RENDERING_AD_COMPONENT_CREATION_END;
        zzdur zzdurVar15 = new zzdur("l.render.acc", zzduqVar14, zzduqVar15);
        zzduq zzduqVar16 = zzduq.RENDERING_CONFIGURE_WEBVIEW_START;
        zzduq zzduqVar17 = zzduq.RENDERING_CONFIGURE_WEBVIEW_END;
        zzdur zzdurVar16 = new zzdur("l.render.cfg-wv", zzduqVar16, zzduqVar17);
        zzduq zzduqVar18 = zzduq.RENDERING_WEBVIEW_LOAD_HTML_START;
        zzduq zzduqVar19 = zzduq.RENDERING_WEBVIEW_LOAD_HTML_END;
        zza = zzgpe.zzo(zzdurVar, zzdurVar2, zzdurVar3, zzdurVar4, zzdurVar5, zzdurVar6, zzdurVar7, zzdurVar8, zzdurVar9, zzdurVar10, zzdurVar11, zzdurVar12, zzdurVar13, zzdurVar14, zzdurVar15, zzdurVar16, new zzdur("l.render.wvlh", zzduqVar18, zzduqVar19), new zzdur("l.render.post", zzduqVar19, zzduqVar2), new zzdur("l.sodv", zzduq.SIGNAL_ON_DISK_VALIDATION_START, zzduq.SIGNAL_ON_DISK_VALIDATION_END), new zzdur("l.sodck", zzduq.SIGNAL_ON_DISK_CACHE_KEY_START, zzduq.SIGNAL_ON_DISK_CACHE_KEY_END), new zzdur("l.sodrar", zzduq.SIGNAL_ON_DISK_READ_AND_REMOVE_START, zzduq.SIGNAL_ON_DISK_READ_AND_REMOVE_END), new zzdur("l.soddc", zzduq.SIGNAL_ON_DISK_DECODE_START, zzduq.SIGNAL_ON_DISK_DECODE_END));
        zzdur zzdurVar17 = new zzdur("l.al", zzduqVar, zzduqVar2);
        zzdur zzdurVar18 = new zzdur("l.al2", zzduqVar3, zzduqVar2);
        zzdur zzdurVar19 = new zzdur("l.dl", zzduqVar, zzduqVar3);
        zzdur zzdurVar20 = new zzdur("l.rcc", zzduqVar3, zzduqVar5);
        zzdur zzdurVar21 = new zzdur("l.cs", zzduqVar5, zzduqVar6);
        zzdur zzdurVar22 = new zzdur("l.cts", zzduqVar6, zzduqVar7);
        zzdur zzdurVar23 = new zzdur("l.gs", zzduqVar8, zzduqVar9);
        zzduq zzduqVar20 = zzduq.GET_AD_DICTIONARY_SDKCORE_START;
        zzdur zzdurVar24 = new zzdur("l.jse", zzduqVar9, zzduqVar20);
        zzduq zzduqVar21 = zzduq.GET_AD_DICTIONARY_SDKCORE_END;
        zzdur zzdurVar25 = new zzdur("l.gad-js", zzduqVar20, zzduqVar21);
        zzduq zzduqVar22 = zzduq.HTTP_RESPONSE_READY;
        zzdur zzdurVar26 = new zzdur("l.http", zzduqVar21, zzduqVar22);
        zzduq zzduqVar23 = zzduq.SCAR_PRELOADER_READY;
        zzdur zzdurVar27 = new zzdur("l.slas.pre", zzduqVar, zzduqVar23);
        zzduq zzduqVar24 = zzduq.SCAR_PRELOADER_PROCESSING_DONE;
        zzdur zzdurVar28 = new zzdur("l.slas.prel.p", zzduqVar23, zzduqVar24);
        zzduq zzduqVar25 = zzduq.zzq;
        zzdur zzdurVar29 = new zzdur("l.jse-nml", zzduqVar22, zzduqVar25);
        zzdur zzdurVar30 = new zzdur("l.jse-nml", zzduqVar24, zzduqVar25);
        zzduq zzduqVar26 = zzduq.NORMALIZATION_AD_RESPONSE_END;
        zzdur zzdurVar31 = new zzdur("l.nml-js", zzduqVar25, zzduqVar26);
        zzduq zzduqVar27 = zzduq.BINDER_CALL_START;
        zzdur zzdurVar32 = new zzdur("l.nml-gmsg", zzduqVar26, zzduqVar27);
        zzduq zzduqVar28 = zzduq.SERVER_RESPONSE_PARSE_START;
        zzdur zzdurVar33 = new zzdur("l.nml-gmsg.s2s", zzduqVar26, zzduqVar28);
        zzdur zzdurVar34 = new zzdur("l.binder", zzduqVar27, zzduqVar28);
        zzdur zzdurVar35 = new zzdur("l.sr", zzduqVar28, zzduqVar12);
        zzdur zzdurVar36 = new zzdur("l.render", zzduqVar12, zzduqVar2);
        zzdur zzdurVar37 = new zzdur("l.t2", zzduq.RENDERING_ADSTRING_TYPE2_FETCH_START, zzduq.RENDERING_ADSTRING_TYPE2_FETCH_END);
        zzduq zzduqVar29 = zzduq.RENDERING_NATIVE_ADS_NATIVE_JS_WEBVIEW_START;
        zzduq zzduqVar30 = zzduq.RENDERING_NATIVE_ADS_PREPROCESS_START;
        zzdur zzdurVar38 = new zzdur("l.render.na.js", zzduqVar29, zzduqVar30);
        zzdur zzdurVar39 = new zzdur("l.render.na.prep", zzduqVar30, zzduq.RENDERING_NATIVE_ADS_PREPROCESS_END);
        zzdur zzdurVar40 = new zzdur("l.render.na.lna", zzduq.RENDERING_NATIVE_ASSETS_LOADING_START, zzduq.RENDERING_NATIVE_ASSETS_LOADING_END);
        zzdur zzdurVar41 = new zzdur("l.render.wvc", zzduqVar13, zzduqVar14);
        zzdur zzdurVar42 = new zzdur("l.render.acc", zzduqVar14, zzduqVar15);
        zzdur zzdurVar43 = new zzdur("l.render.cfg-wv", zzduqVar16, zzduqVar17);
        zzdur zzdurVar44 = new zzdur("l.render.pre", zzduqVar12, zzduqVar13);
        zzdur zzdurVar45 = new zzdur("l.render.post", zzduqVar19, zzduqVar2);
        zzdur zzdurVar46 = new zzdur("l.render.na.post", zzduqVar17, zzduqVar2);
        zzdur zzdurVar47 = new zzdur("l.render.wvlh", zzduqVar18, zzduqVar19);
        zzdur zzdurVar48 = new zzdur("l.na.b", zzduq.NATIVE_ASSETS_LOADING_BASIC_START, zzduq.NATIVE_ASSETS_LOADING_BASIC_END);
        zzdur zzdurVar49 = new zzdur("l.na.im", zzduq.NATIVE_ASSETS_LOADING_IMAGE_START, zzduq.NATIVE_ASSETS_LOADING_IMAGE_END);
        zzdur zzdurVar50 = new zzdur("l.na.imc", zzduq.NATIVE_ASSETS_LOADING_IMAGE_COMPOSITION_START, zzduq.NATIVE_ASSETS_LOADING_IMAGE_COMPOSITION_END);
        zzdur zzdurVar51 = new zzdur("l.na.l", zzduq.NATIVE_ASSETS_LOADING_LOGO_START, zzduq.NATIVE_ASSETS_LOADING_LOGO_END);
        zzdur zzdurVar52 = new zzdur("l.na.ic", zzduq.NATIVE_ASSETS_LOADING_ICON_START, zzduq.NATIVE_ASSETS_LOADING_ICON_END);
        zzdur zzdurVar53 = new zzdur("l.na.a", zzduq.NATIVE_ASSETS_LOADING_ATTRIBUTION_START, zzduq.NATIVE_ASSETS_LOADING_ATTRIBUTION_END);
        zzduq zzduqVar31 = zzduq.NATIVE_ASSETS_LOADING_VIDEO_START;
        zzduq zzduqVar32 = zzduq.NATIVE_ASSETS_LOADING_VIDEO_END;
        zzb = zzgpe.zzo(zzdurVar17, zzdurVar18, zzdurVar19, zzdurVar20, zzdurVar21, zzdurVar22, zzdurVar23, zzdurVar24, zzdurVar25, zzdurVar26, zzdurVar27, zzdurVar28, zzdurVar29, zzdurVar30, zzdurVar31, zzdurVar32, zzdurVar33, zzdurVar34, zzdurVar35, zzdurVar36, zzdurVar37, zzdurVar38, zzdurVar39, zzdurVar40, zzdurVar41, zzdurVar42, zzdurVar43, zzdurVar44, zzdurVar45, zzdurVar46, zzdurVar47, zzdurVar48, zzdurVar49, zzdurVar50, zzdurVar51, zzdurVar52, zzdurVar53, new zzdur("l.na.v", zzduqVar31, zzduqVar32), new zzdur("l.na.vc", zzduq.NATIVE_ASSETS_LOADING_VIDEO_COMPOSITION_START, zzduqVar32), new zzdur("l.na.m", zzduq.NATIVE_ASSETS_LOADING_MEDIA_START, zzduq.NATIVE_ASSETS_LOADING_MEDIA_END), new zzdur("l.na.c", zzduq.NATIVE_ASSETS_LOADING_CUSTOM_START, zzduq.NATIVE_ASSETS_LOADING_CUSTOM_END), new zzdur("l.na.o", zzduq.NATIVE_ASSETS_LOADING_OMID_START, zzduq.NATIVE_ASSETS_LOADING_OMID_END));
    }

    public zzdur(String str, zzduq zzduqVar, zzduq zzduqVar2) {
        this.zzc = str;
        this.zzd = zzduqVar;
        this.zze = zzduqVar2;
    }

    public final String zza() {
        return this.zzc;
    }

    public final zzduq zzb() {
        return this.zzd;
    }

    public final zzduq zzc() {
        return this.zze;
    }
}
