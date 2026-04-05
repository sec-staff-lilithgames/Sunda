package com.mbridge.msdk.tracker.network;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class h<T> extends t<T> {
    protected static final String B = "h";
    private boolean A;

    /* renamed from: w, reason: collision with root package name */
    private final long f43964w;

    /* renamed from: x, reason: collision with root package name */
    private Map<String, String> f43965x;

    /* renamed from: y, reason: collision with root package name */
    private Map<String, String> f43966y;

    /* renamed from: z, reason: collision with root package name */
    private x f43967z;

    public h(int i10, String str, int i11, String str2, long j10) {
        super(i10, str, i11, str2);
        this.A = false;
        if (j10 > 0) {
            this.f43964w = j10;
        } else {
            this.f43964w = ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
        }
    }

    public void a(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        if (this.f43965x == null) {
            this.f43965x = new HashMap();
        }
        try {
            this.f43965x.putAll(map);
        } catch (Exception e10) {
            p0.b(B, "addParams error: " + e10.getMessage());
        }
    }

    public void b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.f43966y == null) {
            this.f43966y = new HashMap();
        }
        try {
            this.f43966y.put(str, str2);
        } catch (Exception e10) {
            p0.b(B, "addHeader error: " + e10.getMessage());
        }
    }

    public void d(boolean z10) {
        this.A = z10;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public Map<String, String> f() {
        if (this.f43966y == null) {
            this.f43966y = new HashMap();
        }
        this.f43966y.put("Charset", C.UTF8_NAME);
        return this.f43966y;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public Map<String, String> i() {
        if (this.f43965x == null) {
            this.f43965x = new HashMap();
        }
        return this.f43965x;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public x o() {
        if (this.f43967z == null) {
            this.f43967z = new e(30000, this.f43964w, 3);
        }
        return this.f43967z;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public boolean a() {
        return this.A && com.mbridge.msdk.foundation.same.d.a(p(), t());
    }
}
