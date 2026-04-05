package com.bykv.vk.openvk.preload.a.b.a;

import com.bykv.vk.openvk.preload.a.p;
import com.bykv.vk.openvk.preload.a.r;
import com.bykv.vk.openvk.preload.a.s;
import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class j extends r<Time> {

    /* renamed from: a, reason: collision with root package name */
    public static final s f16821a = new s() { // from class: com.bykv.vk.openvk.preload.a.b.a.j.1
        @Override // com.bykv.vk.openvk.preload.a.s
        public final <T> r<T> a(com.bykv.vk.openvk.preload.a.d dVar, com.bykv.vk.openvk.preload.a.c.a<T> aVar) {
            if (aVar.a() == Time.class) {
                return new j();
            }
            return null;
        }
    };

    /* renamed from: b, reason: collision with root package name */
    private final DateFormat f16822b = new SimpleDateFormat("hh:mm:ss a");

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bykv.vk.openvk.preload.a.r
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public synchronized Time a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
        if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.NULL) {
            aVar.j();
            return null;
        }
        try {
            return new Time(this.f16822b.parse(aVar.h()).getTime());
        } catch (ParseException e10) {
            throw new p(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bykv.vk.openvk.preload.a.r
    public synchronized void a(com.bykv.vk.openvk.preload.a.d.c cVar, Time time) throws IOException {
        cVar.b(time == null ? null : this.f16822b.format((Date) time));
    }
}
