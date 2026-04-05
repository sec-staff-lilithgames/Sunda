package com.inmobi.media;

import android.media.MediaMetadataRetriever;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Y8 {

    /* renamed from: a, reason: collision with root package name */
    public final long f32577a;

    /* renamed from: b, reason: collision with root package name */
    public final long f32578b;

    /* renamed from: c, reason: collision with root package name */
    public final String f32579c;

    /* renamed from: d, reason: collision with root package name */
    public final C3106z8 f32580d;

    public Y8(long j10, long j11, String referencedAssetId, C3106z8 nativeDataModel) {
        kotlin.jvm.internal.e0.checkNotNullParameter(referencedAssetId, "referencedAssetId");
        kotlin.jvm.internal.e0.checkNotNullParameter(nativeDataModel, "nativeDataModel");
        this.f32577a = j10;
        this.f32578b = j11;
        this.f32579c = referencedAssetId;
        this.f32580d = nativeDataModel;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue("Z8", "getSimpleName(...)");
    }

    public final long a() throws IOException, IllegalArgumentException {
        long j10 = this.f32577a;
        C2903n8 c2903n8M = this.f32580d.m(this.f32579c);
        try {
            if (c2903n8M instanceof C2887m9) {
                InterfaceC3028uf interfaceC3028ufD = ((C2887m9) c2903n8M).d();
                String strB = interfaceC3028ufD != null ? ((C3011tf) interfaceC3028ufD).b() : null;
                if (strB != null) {
                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                    mediaMetadataRetriever.setDataSource(strB);
                    j10 += (long) ((this.f32578b / 100.0d) * ((mediaMetadataRetriever.extractMetadata(9) != null ? Long.parseLong(r2) : 0L) / 1000));
                    mediaMetadataRetriever.release();
                }
            }
        } catch (Exception unused) {
        }
        return Math.max(j10, 0L);
    }
}
