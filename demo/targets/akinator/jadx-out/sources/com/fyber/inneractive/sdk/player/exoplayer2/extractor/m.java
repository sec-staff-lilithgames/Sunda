package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class m {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f24900c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a, reason: collision with root package name */
    public int f24901a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f24902b = -1;

    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.metadata.b bVar) throws NumberFormatException {
        int i10 = 0;
        while (true) {
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.o[] oVarArr = bVar.f25660a;
            if (i10 >= oVarArr.length) {
                return;
            }
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.o oVar = oVarArr[i10];
            if (oVar instanceof com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j) {
                com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j jVar = (com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j) oVar;
                String str = jVar.f25678c;
                String str2 = jVar.f25679d;
                if ("iTunSMPB".equals(str)) {
                    Matcher matcher = f24900c.matcher(str2);
                    if (matcher.find()) {
                        try {
                            int i11 = Integer.parseInt(matcher.group(1), 16);
                            int i12 = Integer.parseInt(matcher.group(2), 16);
                            if (i11 > 0 || i12 > 0) {
                                this.f24901a = i11;
                                this.f24902b = i12;
                                return;
                            }
                        } catch (NumberFormatException unused) {
                            continue;
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            i10++;
        }
    }
}
