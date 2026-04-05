package rj;

import com.google.firebase.inappmessaging.model.MessageType;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public final x f84481a;

    /* renamed from: b, reason: collision with root package name */
    public final x f84482b;

    /* renamed from: c, reason: collision with root package name */
    public final String f84483c;

    /* renamed from: d, reason: collision with root package name */
    public final l f84484d;

    /* renamed from: e, reason: collision with root package name */
    public final h f84485e;

    /* renamed from: f, reason: collision with root package name */
    public final String f84486f;

    /* renamed from: g, reason: collision with root package name */
    public final MessageType f84487g;

    /* renamed from: h, reason: collision with root package name */
    public final i f84488h;

    /* renamed from: i, reason: collision with root package name */
    public final Map f84489i;

    @Deprecated
    public o(x xVar, x xVar2, String str, l lVar, h hVar, b bVar, String str2, String str3, String str4, Boolean bool, MessageType messageType, Map<String, String> map) {
        this.f84481a = xVar;
        this.f84482b = xVar2;
        this.f84483c = str;
        this.f84484d = lVar;
        this.f84485e = hVar;
        this.f84486f = str2;
        this.f84487g = messageType;
        this.f84488h = new i(str3, str4, bool.booleanValue());
        this.f84489i = map;
    }

    @Deprecated
    public abstract b getAction();

    @Deprecated
    public h getActionButton() {
        return getAction() != null ? getAction().getButton() : this.f84485e;
    }

    @Deprecated
    public String getBackgroundHexColor() {
        return this.f84486f;
    }

    @Deprecated
    public x getBody() {
        return this.f84482b;
    }

    @Deprecated
    public String getCampaignId() {
        return this.f84488h.getCampaignId();
    }

    public i getCampaignMetadata() {
        return this.f84488h;
    }

    @Deprecated
    public String getCampaignName() {
        return this.f84488h.getCampaignName();
    }

    public Map<String, String> getData() {
        return this.f84489i;
    }

    @Deprecated
    public l getImageData() {
        return this.f84484d;
    }

    @Deprecated
    public String getImageUrl() {
        return this.f84483c;
    }

    @Deprecated
    public Boolean getIsTestMessage() {
        return Boolean.valueOf(this.f84488h.getIsTestMessage());
    }

    public MessageType getMessageType() {
        return this.f84487g;
    }

    @Deprecated
    public x getTitle() {
        return this.f84481a;
    }

    public o(i iVar, MessageType messageType, Map<String, String> map) {
        this.f84488h = iVar;
        this.f84487g = messageType;
        this.f84489i = map;
    }
}
