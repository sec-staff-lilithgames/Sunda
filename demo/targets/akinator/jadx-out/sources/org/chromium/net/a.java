package org.chromium.net;

import java.util.Comparator;
import org.chromium.net.CronetEngine;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a implements Comparator {
    @Override // java.util.Comparator
    public int compare(CronetProvider cronetProvider, CronetProvider cronetProvider2) {
        if (CronetProvider.PROVIDER_NAME_FALLBACK.equals(cronetProvider.getName())) {
            return 1;
        }
        if (CronetProvider.PROVIDER_NAME_FALLBACK.equals(cronetProvider2.getName())) {
            return -1;
        }
        return -CronetEngine.Builder.compareVersions(cronetProvider.getVersion(), cronetProvider2.getVersion());
    }
}
