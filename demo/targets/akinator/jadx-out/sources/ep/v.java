package ep;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import gn.x0;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class v {
    public static String getContainerMimeType(io.bidmachine.media3.common.b bVar) {
        String str = bVar.f60665o;
        return x0.isVideo(str) ? MimeTypes.VIDEO_MP4 : x0.isAudio(str) ? MimeTypes.AUDIO_MP4 : x0.isImage(str) ? Objects.equals(str, "image/heic") ? "image/heif" : Objects.equals(str, "image/avif") ? "image/avif" : MimeTypes.APPLICATION_MP4 : MimeTypes.APPLICATION_MP4;
    }

    public static String getContainerMimeType(List<f0> list) {
        Iterator<f0> it = list.iterator();
        boolean z10 = false;
        String str = null;
        while (it.hasNext()) {
            String str2 = it.next().f54859a.f54823g.f60665o;
            if (x0.isVideo(str2)) {
                return MimeTypes.VIDEO_MP4;
            }
            if (x0.isAudio(str2)) {
                z10 = true;
            } else if (x0.isImage(str2)) {
                if (Objects.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (Objects.equals(str2, "image/avif")) {
                    str = "image/avif";
                }
            }
        }
        if (z10) {
            return MimeTypes.AUDIO_MP4;
        }
        return str != null ? str : MimeTypes.APPLICATION_MP4;
    }
}
