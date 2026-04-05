package zn;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface v extends f {
    @Override // zn.f
    /* synthetic */ c getDownload(String str) throws IOException;

    @Override // zn.f
    /* synthetic */ d getDownloads(int... iArr) throws IOException;

    void putDownload(c cVar) throws IOException;

    void removeDownload(String str) throws IOException;

    void setDownloadingStatesToQueued() throws IOException;

    void setStatesToRemoving() throws IOException;

    void setStopReason(int i10) throws IOException;

    void setStopReason(String str, int i10) throws IOException;
}
