package org.chromium.net;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ File f79821a;

    public b(File file) {
        this.f79821a = file;
    }

    @Override // org.chromium.net.e
    public FileChannel getChannel() throws IOException {
        return new FileInputStream(this.f79821a).getChannel();
    }
}
