package com.bykv.vk.openvk.preload.geckox.d;

import android.util.Pair;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class d extends com.bykv.vk.openvk.preload.b.d<List<String>, List<Pair<String, Long>>> {

    /* renamed from: d, reason: collision with root package name */
    private File f17140d;

    /* renamed from: e, reason: collision with root package name */
    private String f17141e;

    @Override // com.bykv.vk.openvk.preload.b.d
    public final /* synthetic */ Object a(com.bykv.vk.openvk.preload.b.b<List<Pair<String, Long>>> bVar, List<String> list) throws Throwable {
        List<String> list2 = list;
        GeckoLogger.d("gecko-debug-tag", "get local channel version:", list2);
        File file = new File(this.f17140d, this.f17141e);
        ArrayList arrayList = new ArrayList();
        for (String str : list2) {
            Long lA = com.bykv.vk.openvk.preload.geckox.utils.g.a(new File(file, str));
            arrayList.add(new Pair(str, Long.valueOf(lA == null ? 0L : lA.longValue())));
        }
        return bVar.a((com.bykv.vk.openvk.preload.b.b<List<Pair<String, Long>>>) arrayList);
    }

    @Override // com.bykv.vk.openvk.preload.b.d
    public final void a(Object... objArr) {
        super.a(objArr);
        this.f17140d = (File) objArr[0];
        this.f17141e = (String) objArr[1];
    }
}
