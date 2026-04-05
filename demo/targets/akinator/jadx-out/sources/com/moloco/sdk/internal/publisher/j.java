package com.moloco.sdk.internal.publisher;

import b0.e2;
import bp.oM.DwaEpyvxz;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.publisher.AdFormatType;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class j implements e0 {

    /* renamed from: b, reason: collision with root package name */
    public final AdFormatType f46312b;

    /* renamed from: c, reason: collision with root package name */
    public final long f46313c;

    /* renamed from: e, reason: collision with root package name */
    public long f46314e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public /* synthetic */ j(AdFormatType adFormatType, long j10, kotlin.jvm.internal.u uVar) {
        this(adFormatType, j10);
    }

    @Override // com.moloco.sdk.internal.publisher.e0
    public long getCreateAdObjectStartTime() {
        return this.f46314e;
    }

    @Override // com.moloco.sdk.internal.publisher.e0
    public void setCreateAdObjectStartTime(long j10) {
        this.f46314e = j10;
    }

    public j(AdFormatType adFormatType, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adFormatType, "adFormatType");
        this.f46312b = adFormatType;
        this.f46313c = j10;
    }

    public final long a(long j10) {
        long createAdObjectStartTime = j10 - getCreateAdObjectStartTime();
        long j11 = this.f46313c;
        long duration = tv.h.toDuration(tv.f.m7195getInWholeMillisecondsimpl(j11) - createAdObjectStartTime, tv.i.f87441f);
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f46312b);
        sb2.append(" timeout: ");
        sb2.append((Object) tv.f.m7219toStringimpl(j11));
        e2.A(sb2, " , create ad duration: ", createAdObjectStartTime, " ms (createTime: ");
        sb2.append(getCreateAdObjectStartTime());
        sb2.append(" ms, loadStartTime: ");
        sb2.append(j10);
        sb2.append(DwaEpyvxz.zyxDEHfFZWbbYgL);
        sb2.append((Object) tv.f.m7219toStringimpl(duration));
        MolocoLogger.debug$default(molocoLogger, "AdCreateLoadTimeoutManager", sb2.toString(), false, 4, null);
        return duration;
    }
}
