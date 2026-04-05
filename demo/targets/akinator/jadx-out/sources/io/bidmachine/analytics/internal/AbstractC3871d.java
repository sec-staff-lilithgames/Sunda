package io.bidmachine.analytics.internal;

import io.bidmachine.analytics.ReaderConfig;
import java.io.File;
import java.io.FileNotFoundException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: io.bidmachine.analytics.internal.d, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC3871d extends AbstractC3876i {
    public abstract File a(ReaderConfig.Rule rule);

    @Override // io.bidmachine.analytics.internal.AbstractC3876i
    public Object a(ReaderConfig.Rule rule, zu.d dVar) {
        return a(this, rule, dVar);
    }

    public static /* synthetic */ Object a(AbstractC3871d abstractC3871d, ReaderConfig.Rule rule, zu.d dVar) throws FileNotFoundException {
        File fileA = abstractC3871d.a(rule);
        if (!fileA.exists()) {
            throw new FileNotFoundException();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(fileA.lastModified());
        sb2.append('_');
        sb2.append(fileA.length());
        return sb2.toString();
    }
}
