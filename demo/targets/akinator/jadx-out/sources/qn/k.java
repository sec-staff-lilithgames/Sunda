package qn;

import android.net.Uri;
import java.util.List;
import nh.b5;
import qn.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class k extends l {

    /* renamed from: h, reason: collision with root package name */
    public final String f83354h;

    /* renamed from: i, reason: collision with root package name */
    public final i f83355i;

    /* renamed from: j, reason: collision with root package name */
    public final o f83356j;

    public k(long j10, io.bidmachine.media3.common.b bVar, List<b> list, m.e eVar, List<e> list2, List<e> list3, List<e> list4, String str, long j11) {
        super(bVar, list, eVar, list2, list3, list4);
        Uri.parse(list.get(0).f83301a);
        i index = eVar.getIndex();
        this.f83355i = index;
        this.f83354h = str;
        this.f83356j = index != null ? null : new o(new i(null, 0L, j11));
    }

    public static k newInstance(long j10, io.bidmachine.media3.common.b bVar, String str, long j11, long j12, long j13, long j14, List<e> list, String str2, long j15) {
        return new k(j10, bVar, b5.of(new b(str)), new m.e(new i(null, j11, (j12 - j11) + 1), 1L, 0L, j13, (j14 - j13) + 1), list, b5.of(), b5.of(), str2, j15);
    }

    @Override // qn.l
    public String getCacheKey() {
        return this.f83354h;
    }

    @Override // qn.l
    public pn.q getIndex() {
        return this.f83356j;
    }

    @Override // qn.l
    public i getIndexUri() {
        return this.f83355i;
    }
}
