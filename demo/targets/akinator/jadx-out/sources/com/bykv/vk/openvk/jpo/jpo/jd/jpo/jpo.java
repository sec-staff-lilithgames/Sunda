package com.bykv.vk.openvk.jpo.jpo.jd.jpo;

import android.content.Context;
import android.media.MediaDataSource;
import android.text.TextUtils;
import com.bykv.vk.openvk.jpo.jpo.jd.jpo.jpo.jd;
import com.bykv.vk.openvk.jpo.jpo.jd.jpo.jpo.wqx;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo extends MediaDataSource {
    public static final ConcurrentHashMap<String, jpo> jpo = new ConcurrentHashMap<>();

    /* renamed from: cm, reason: collision with root package name */
    private final Context f16690cm;

    /* renamed from: jd, reason: collision with root package name */
    private final wqx f16691jd;
    private final com.bykv.vk.openvk.jpo.jpo.jpo.wqx.wqx my;
    private long wqx = -2147483648L;

    public jpo(Context context, com.bykv.vk.openvk.jpo.jpo.jpo.wqx.wqx wqxVar) {
        this.f16690cm = context;
        this.my = wqxVar;
        this.f16691jd = new jd(context, wqxVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.my.hna();
        wqx wqxVar = this.f16691jd;
        if (wqxVar != null) {
            wqxVar.jd();
        }
        jpo.remove(this.my.sq());
    }

    @Override // android.media.MediaDataSource
    public long getSize() throws IOException {
        if (this.wqx == -2147483648L) {
            if (this.f16690cm == null || TextUtils.isEmpty(this.my.hna())) {
                return -1L;
            }
            this.wqx = this.f16691jd.wqx();
        }
        return this.wqx;
    }

    public com.bykv.vk.openvk.jpo.jpo.jpo.wqx.wqx jpo() {
        return this.my;
    }

    @Override // android.media.MediaDataSource
    public int readAt(long j10, byte[] bArr, int i10, int i11) throws IOException {
        int iJpo = this.f16691jd.jpo(j10, bArr, i10, i11);
        int length = bArr.length;
        Objects.toString(Thread.currentThread());
        return iJpo;
    }

    public static jpo jpo(Context context, com.bykv.vk.openvk.jpo.jpo.jpo.wqx.wqx wqxVar) {
        jpo jpoVar = new jpo(context, wqxVar);
        jpo.put(wqxVar.sq(), jpoVar);
        return jpoVar;
    }
}
