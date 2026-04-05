package qb;

import com.mbridge.msdk.foundation.same.task.Ri.TJzY;
import org.w3c.dom.Document;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class k extends z {
    @Override // qb.z
    public void parseAkWSResponse(Document xmlResponse) {
        kotlin.jvm.internal.e0.checkNotNullParameter(xmlResponse, "xmlResponse");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(lb.e eVar, String objectId, String photoId) {
        super(eVar);
        kotlin.jvm.internal.e0.checkNotNullParameter(eVar, TJzY.JThSOnVxV);
        kotlin.jvm.internal.e0.checkNotNullParameter(objectId, "objectId");
        kotlin.jvm.internal.e0.checkNotNullParameter(photoId, "photoId");
        this.f82730i = "vote_photo.php";
        addParameter("objet_id", objectId);
        addParameter("photo_id", photoId);
    }
}
