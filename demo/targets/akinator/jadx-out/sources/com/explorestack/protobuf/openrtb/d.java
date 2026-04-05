package com.explorestack.protobuf.openrtb;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.h;
import com.explorestack.protobuf.i5;
import com.explorestack.protobuf.i7;
import com.explorestack.protobuf.kb;
import com.explorestack.protobuf.m5;
import com.fyber.inneractive.sdk.player.exoplayer2.text.Ir.NyKZx;
import com.unity3d.services.core.request.NJc.yFkbx;
import io.ktor.http.auth.AuthScheme;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final Descriptors.Descriptor f22443a;

    /* renamed from: b, reason: collision with root package name */
    public static final i7 f22444b;

    /* renamed from: c, reason: collision with root package name */
    public static final Descriptors.Descriptor f22445c;

    /* renamed from: d, reason: collision with root package name */
    public static final i7 f22446d;

    /* renamed from: e, reason: collision with root package name */
    public static final Descriptors.Descriptor f22447e;

    /* renamed from: f, reason: collision with root package name */
    public static final i7 f22448f;

    /* renamed from: g, reason: collision with root package name */
    public static final Descriptors.Descriptor f22449g;

    /* renamed from: h, reason: collision with root package name */
    public static final i7 f22450h;

    /* renamed from: i, reason: collision with root package name */
    public static final Descriptors.Descriptor f22451i;

    /* renamed from: j, reason: collision with root package name */
    public static final i7 f22452j;

    /* renamed from: k, reason: collision with root package name */
    public static final Descriptors.Descriptor f22453k;

    /* renamed from: l, reason: collision with root package name */
    public static final i7 f22454l;

    /* renamed from: m, reason: collision with root package name */
    public static final Descriptors.Descriptor f22455m;

    /* renamed from: n, reason: collision with root package name */
    public static final i7 f22456n;

    /* renamed from: o, reason: collision with root package name */
    public static final Descriptors.Descriptor f22457o;

    /* renamed from: p, reason: collision with root package name */
    public static final i7 f22458p;

    /* renamed from: q, reason: collision with root package name */
    public static final Descriptors.Descriptor f22459q;

    /* renamed from: r, reason: collision with root package name */
    public static final i7 f22460r;

    /* renamed from: s, reason: collision with root package name */
    public static final Descriptors.Descriptor f22461s;

    /* renamed from: t, reason: collision with root package name */
    public static final i7 f22462t;

    /* renamed from: u, reason: collision with root package name */
    public static final Descriptors.FileDescriptor f22463u = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n)bidmachine/protobuf/openrtb/openrtb.proto\u0012\u001bbidmachine.protobuf.openrtb\u001a\u0019google/protobuf/any.proto\u001a\u001cgoogle/protobuf/struct.proto\"¼\u0001\n\u0007Openrtb\u0012\u000b\n\u0003ver\u0018\u0001 \u0001(\t\u0012\u0012\n\ndomainspec\u0018\u0002 \u0001(\t\u0012\u0011\n\tdomainver\u0018\u0003 \u0001(\t\u00127\n\u0007request\u0018\u0004 \u0001(\u000b2$.bidmachine.protobuf.openrtb.RequestH\u0000\u00129\n\bresponse\u0018\u0005 \u0001(\u000b2%.bidmachine.protobuf.openrtb.ResponseH\u0000B\t\n\u0007payload\"Ð\t\n\u0007Request\u0012\n\n\u0002id\u0018\u0001 \u0001(\t\u0012\f\n\u0004test\u0018\u0002 \u0001(\b\u0012\f\n\u0004tmax\u0018\u0003 \u0001(\r\u0012\n\n\u0002at\u0018\u0004 \u0001(\r\u0012\u000b\n\u0003cur\u0018\u0005 \u0003(\t\u0012\f\n\u0004seat\u0018\u0006 \u0003(\t\u0012\r\n\u0005wseat\u0018\u0007 \u0001(\b\u0012\r\n\u0005cdata\u0018\b \u0001(\t\u0012;\n\u0006source\u0018\t \u0001(\u000b2+.bidmachine.protobuf.openrtb.Request.Source\u00127\n\u0004item\u0018\n \u0003(\u000b2).bidmachine.protobuf.openrtb.Request.Item\u0012\u000f\n\u0007package\u0018\u000b \u0001(\r\u0012%\n\u0007context\u0018\f \u0001(\u000b2\u0014.google.protobuf.Any\u0012$\n\u0003ext\u0018\u000e \u0001(\u000b2\u0017.google.protobuf.Struct\u0012'\n\text_proto\u0018\r \u0003(\u000b2\u0014.google.protobuf.Any\u001a®\u0001\n\u0006Source\u0012\u000b\n\u0003tid\u0018\u0001 \u0001(\t\u0012\n\n\u0002ds\u0018\u0002 \u0001(\t\u0012\u000e\n\u0006dsgver\u0018\u0003 \u0001(\r\u0012\u000e\n\u0006digest\u0018\u0004 \u0001(\t\u0012\f\n\u0004cert\u0018\u0005 \u0001(\t\u0012\u000e\n\u0006pchain\u0018\u0006 \u0001(\t\u0012$\n\u0003ext\u0018\b \u0001(\u000b2\u0017.google.protobuf.Struct\u0012'\n\text_proto\u0018\u0007 \u0003(\u000b2\u0014.google.protobuf.Any\u001a©\u0005\n\u0004Item\u0012\n\n\u0002id\u0018\u0001 \u0001(\t\u0012\u000b\n\u0003qty\u0018\u0002 \u0001(\r\u0012\u000b\n\u0003seq\u0018\u0003 \u0001(\r\u0012\u000b\n\u0003flr\u0018\u0004 \u0001(\u0001\u0012\u000e\n\u0006flrcur\u0018\u0006 \u0001(\t\u0012\u000b\n\u0003exp\u0018\u0007 \u0001(\r\u0012\n\n\u0002dt\u0018\b \u0001(\t\u0012\f\n\u0004dlvy\u0018\t \u0001(\r\u0012@\n\u0006metric\u0018\n \u0003(\u000b20.bidmachine.protobuf.openrtb.Request.Item.Metric\u0012<\n\u0004deal\u0018\u000b \u0003(\u000b2..bidmachine.protobuf.openrtb.Request.Item.Deal\u0012\u000f\n\u0007private\u0018\f \u0001(\b\u0012\"\n\u0004spec\u0018\r \u0001(\u000b2\u0014.google.protobuf.Any\u0012$\n\u0003ext\u0018\u000f \u0001(\u000b2\u0017.google.protobuf.Struct\u0012'\n\text_proto\u0018\u000e \u0003(\u000b2\u0014.google.protobuf.Any\u001a\u0084\u0001\n\u0006Metric\u0012\f\n\u0004type\u0018\u0001 \u0001(\t\u0012\r\n\u0005value\u0018\u0002 \u0001(\u0002\u0012\u000e\n\u0006vendor\u0018\u0003 \u0001(\t\u0012$\n\u0003ext\u0018\u0005 \u0001(\u000b2\u0017.google.protobuf.Struct\u0012'\n\text_proto\u0018\u0004 \u0003(\u000b2\u0014.google.protobuf.Any\u001a«\u0001\n\u0004Deal\u0012\n\n\u0002id\u0018\u0001 \u0001(\t\u0012\u000b\n\u0003flr\u0018\u0002 \u0001(\u0001\u0012\u000e\n\u0006flrcur\u0018\u0003 \u0001(\t\u0012\n\n\u0002at\u0018\u0004 \u0001(\r\u0012\r\n\u0005wseat\u0018\u0005 \u0003(\t\u0012\u0010\n\bwadomain\u0018\u0006 \u0003(\t\u0012$\n\u0003ext\u0018\b \u0001(\u000b2\u0017.google.protobuf.Struct\u0012'\n\text_proto\u0018\u0007 \u0003(\u000b2\u0014.google.protobuf.Any\"\u0091\u0007\n\bResponse\u0012\n\n\u0002id\u0018\u0001 \u0001(\t\u0012\r\n\u0005bidid\u0018\u0002 \u0001(\t\u00125\n\u0003nbr\u0018\u0003 \u0001(\u000e2(.bidmachine.protobuf.openrtb.NoBidReason\u0012\u000b\n\u0003cur\u0018\u0004 \u0001(\t\u0012\r\n\u0005cdata\u0018\u0005 \u0001(\t\u0012>\n\u0007seatbid\u0018\u0006 \u0003(\u000b2-.bidmachine.protobuf.openrtb.Response.Seatbid\u0012$\n\u0003ext\u0018\b \u0001(\u000b2\u0017.google.protobuf.Struct\u0012'\n\text_proto\u0018\u0007 \u0003(\u000b2\u0014.google.protobuf.Any\u001a\u0087\u0005\n\u0007Seatbid\u0012\f\n\u0004seat\u0018\u0001 \u0001(\t\u0012\u000f\n\u0007package\u0018\u0002 \u0001(\b\u0012>\n\u0003bid\u0018\u0003 \u0003(\u000b21.bidmachine.protobuf.openrtb.Response.Seatbid.Bid\u0012$\n\u0003ext\u0018\u0005 \u0001(\u000b2\u0017.google.protobuf.Struct\u0012'\n\text_proto\u0018\u0004 \u0003(\u000b2\u0014.google.protobuf.Any\u001aÍ\u0003\n\u0003Bid\u0012\n\n\u0002id\u0018\u0001 \u0001(\t\u0012\f\n\u0004item\u0018\u0002 \u0001(\t\u0012\r\n\u0005price\u0018\u0003 \u0001(\u0001\u0012\f\n\u0004deal\u0018\u0004 \u0001(\t\u0012\u000b\n\u0003cid\u0018\u0005 \u0001(\t\u0012\u000e\n\u0006tactic\u0018\u0006 \u0001(\t\u0012\f\n\u0004purl\u0018\u0007 \u0001(\t\u0012\f\n\u0004burl\u0018\b \u0001(\t\u0012\f\n\u0004lurl\u0018\t \u0001(\t\u0012\u000b\n\u0003exp\u0018\n \u0001(\r\u0012\u000b\n\u0003mid\u0018\u000b \u0001(\t\u0012F\n\u0005macro\u0018\f \u0003(\u000b27.bidmachine.protobuf.openrtb.Response.Seatbid.Bid.Macro\u0012#\n\u0005media\u0018\r \u0001(\u000b2\u0014.google.protobuf.Any\u0012$\n\u0003ext\u0018\u000f \u0001(\u000b2\u0017.google.protobuf.Struct\u0012'\n\text_proto\u0018\u000e \u0003(\u000b2\u0014.google.protobuf.Any\u001ar\n\u0005Macro\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\t\u0012\r\n\u0005value\u0018\u0002 \u0001(\t\u0012$\n\u0003ext\u0018\u0004 \u0001(\u000b2\u0017.google.protobuf.Struct\u0012'\n\text_proto\u0018\u0003 \u0003(\u000b2\u0014.google.protobuf.Any*\u0086\u0005\n\u000bNoBidReason\u0012\u0019\n\u0015NO_BID_REASON_INVALID\u0010\u0000\u0012!\n\u001dNO_BID_REASON_TECHNICAL_ERROR\u0010\u0001\u0012!\n\u001dNO_BID_REASON_INVALID_REQUEST\u0010\u0002\u0012#\n\u001fNO_BID_REASON_KNOWN_WEB_CRAWLER\u0010\u0003\u0012#\n\u001fNO_BID_REASON_NON_HUMAN_TRAFFIC\u0010\u0004\u0012\u001a\n\u0016NO_BID_REASON_PROXY_IP\u0010\u0005\u0012$\n NO_BID_REASON_UNSUPPORTED_DEVICE\u0010\u0006\u0012\u0019\n\u0015NO_BID_REASON_BLOCKED\u0010\u0007\u0012 \n\u001cNO_BID_REASON_UNMATCHED_USER\u0010\b\u0012$\n NO_BID_REASON_DAILY_USER_CAP_MET\u0010\t\u0012&\n\"NO_BID_REASON_DAILY_DOMAIN_CAP_MET\u0010\n\u00123\n/NO_BID_REASON_ADS_TXT_AUTHORIZATION_UNAVAILABLE\u0010\u000b\u00121\n-NO_BID_REASON_ADS_TXT_AUTHORIZATION_VIOLATION\u0010\f\u00125\n1NO_BID_REASON_ADS_CERT_AUTHENTICATION_UNAVAILABLE\u0010\r\u00123\n/NO_BID_REASON_ADS_CERT_AUTHENTICATION_VIOLATION\u0010\u000e\u0012+\n'NO_BID_REASON_INSUFFICIENT_AUCTION_TIME\u0010\u000f*\u0093\n\n\nLossReason\u0012\u0017\n\u0013LOSS_REASON_BID_WON\u0010\u0000\u0012\u001e\n\u001aLOSS_REASON_INTERNAL_ERROR\u0010\u0001\u0012.\n*LOSS_REASON_IMPRESSION_OPPORTUNITY_EXPIRED\u0010\u0002\u0012$\n LOSS_REASON_INVALID_BID_RESPONSE\u0010\u0003\u0012\u001f\n\u001bLOSS_REASON_INVALID_DEAL_ID\u0010\u0004\u0012\"\n\u001eLOSS_REASON_INVALID_AUCTION_ID\u0010\u0005\u0012)\n%LOSS_REASON_INVALID_ADVERTISER_DOMAIN\u0010\u0006\u0012\u001e\n\u001aLOSS_REASON_MISSING_MARKUP\u0010\u0007\u0012#\n\u001fLOSS_REASON_MISSING_CREATIVE_ID\u0010\b\u0012!\n\u001dLOSS_REASON_MISSING_BID_PRICE\u0010\t\u0012.\n*LOSS_REASON_MISSING_CREATIVE_APPROVAL_DATA\u0010\n\u0012#\n\u001fLOSS_REASON_BELOW_AUCTION_FLOOR\u0010d\u0012 \n\u001cLOSS_REASON_BELOW_DEAL_FLOOR\u0010e\u0012\"\n\u001eLOSS_REASON_LOST_TO_HIGHER_BID\u0010f\u0012\u001e\n\u001aLOSS_REASON_LOST_TO_A_DEAL\u0010g\u0012\u001c\n\u0018LOSS_REASON_SEAT_BLOCKED\u0010h\u0012*\n%LOSS_REASON_CREATIVE_FILTERED_GENERAL\u0010È\u0001\u00125\n0LOSS_REASON_CREATIVE_FILTERED_PENDING_PROCESSING\u0010É\u0001\u0012.\n)LOSS_REASON_CREATIVE_FILTERED_DISAPPROVED\u0010Ê\u0001\u00123\n.LOSS_REASON_CREATIVE_FILTERED_SIZE_NOT_ALLOWED\u0010Ë\u0001\u0012<\n7LOSS_REASON_CREATIVE_FILTERED_INCORRECT_CREATIVE_FORMAT\u0010Ì\u0001\u00128\n3LOSS_REASON_CREATIVE_FILTERED_ADVERTISER_EXCLUSIONS\u0010Í\u0001\u0012-\n(LOSS_REASON_CREATIVE_FILTERED_NOT_SECURE\u0010Î\u0001\u00126\n1LOSS_REASON_CREATIVE_FILTERED_LANGUAGE_EXCLUSIONS\u0010Ï\u0001\u00126\n1LOSS_REASON_CREATIVE_FILTERED_CATEGORY_EXCLUSIONS\u0010Ð\u0001\u0012@\n;LOSS_REASON_CREATIVE_FILTERED_CREATIVE_ATTRIBUTE_EXCLUSIONS\u0010Ñ\u0001\u00125\n0LOSS_REASON_CREATIVE_FILTERED_AD_TYPE_EXCLUSIONS\u0010Ò\u0001\u00125\n0LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG\u0010Ó\u0001\u00126\n1LOSS_REASON_CREATIVE_FILTERED_NOT_ALLOWED_IN_DEAL\u0010Ô\u0001B:\n!com.explorestack.protobuf.openrtbB\fOpenrtbProtoP\u0001¢\u0002\u0004ORTBb\u0006proto3"}, new Descriptors.FileDescriptor[]{h.getDescriptor(), kb.getDescriptor()});

    public static Descriptors.FileDescriptor getDescriptor() {
        return f22463u;
    }

    public static void registerAllExtensions(m5 m5Var) {
    }

    static {
        Descriptors.Descriptor descriptor = getDescriptor().getMessageTypes().get(0);
        f22443a = descriptor;
        f22444b = new i7(descriptor, new String[]{"Ver", "Domainspec", "Domainver", "Request", "Response", "Payload"});
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(1);
        f22445c = descriptor2;
        f22446d = new i7(descriptor2, new String[]{"Id", "Test", "Tmax", "At", NyKZx.bPLE, "Seat", "Wseat", "Cdata", "Source", "Item", "Package", "Context", "Ext", "ExtProto"});
        Descriptors.Descriptor descriptor3 = descriptor2.getNestedTypes().get(0);
        f22447e = descriptor3;
        f22448f = new i7(descriptor3, new String[]{"Tid", "Ds", "Dsgver", AuthScheme.Digest, "Cert", "Pchain", "Ext", "ExtProto"});
        Descriptors.Descriptor descriptor4 = descriptor2.getNestedTypes().get(1);
        f22449g = descriptor4;
        f22450h = new i7(descriptor4, new String[]{"Id", "Qty", "Seq", "Flr", "Flrcur", "Exp", "Dt", "Dlvy", "Metric", "Deal", "Private", "Spec", "Ext", "ExtProto"});
        Descriptors.Descriptor descriptor5 = descriptor4.getNestedTypes().get(0);
        f22451i = descriptor5;
        f22452j = new i7(descriptor5, new String[]{"Type", "Value", "Vendor", "Ext", "ExtProto"});
        Descriptors.Descriptor descriptor6 = descriptor4.getNestedTypes().get(1);
        f22453k = descriptor6;
        f22454l = new i7(descriptor6, new String[]{"Id", "Flr", "Flrcur", "At", "Wseat", "Wadomain", "Ext", "ExtProto"});
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(2);
        f22455m = descriptor7;
        f22456n = new i7(descriptor7, new String[]{"Id", "Bidid", "Nbr", "Cur", "Cdata", yFkbx.nSDP, "Ext", "ExtProto"});
        Descriptors.Descriptor descriptor8 = descriptor7.getNestedTypes().get(0);
        f22457o = descriptor8;
        f22458p = new i7(descriptor8, new String[]{"Seat", "Package", "Bid", "Ext", "ExtProto"});
        Descriptors.Descriptor descriptor9 = descriptor8.getNestedTypes().get(0);
        f22459q = descriptor9;
        f22460r = new i7(descriptor9, new String[]{"Id", "Item", "Price", "Deal", "Cid", "Tactic", "Purl", "Burl", "Lurl", "Exp", "Mid", "Macro", "Media", "Ext", "ExtProto"});
        Descriptors.Descriptor descriptor10 = descriptor9.getNestedTypes().get(0);
        f22461s = descriptor10;
        f22462t = new i7(descriptor10, new String[]{"Key", "Value", "Ext", "ExtProto"});
        h.getDescriptor();
        kb.getDescriptor();
    }

    public static void registerAllExtensions(i5 i5Var) {
        registerAllExtensions((m5) i5Var);
    }
}
