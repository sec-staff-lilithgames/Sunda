package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist;

import com.fyber.inneractive.sdk.player.exoplayer2.o;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b extends e {

    /* renamed from: b, reason: collision with root package name */
    public final List f24822b;

    /* renamed from: c, reason: collision with root package name */
    public final List f24823c;

    /* renamed from: d, reason: collision with root package name */
    public final List f24824d;

    /* renamed from: e, reason: collision with root package name */
    public final o f24825e;

    /* renamed from: f, reason: collision with root package name */
    public final List f24826f;

    public b(String str, List list, List list2, List list3, o oVar, List list4) {
        super(str);
        this.f24822b = Collections.unmodifiableList(list);
        this.f24823c = Collections.unmodifiableList(list2);
        this.f24824d = Collections.unmodifiableList(list3);
        this.f24825e = oVar;
        this.f24826f = list4 != null ? Collections.unmodifiableList(list4) : null;
    }
}
