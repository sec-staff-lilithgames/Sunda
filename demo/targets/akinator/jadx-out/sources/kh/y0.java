package kh;

import com.google.api.DocumentationRule;
import com.google.api.Page;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public interface y0 extends MessageLiteOrBuilder {
    String getDocumentationRootUrl();

    ByteString getDocumentationRootUrlBytes();

    String getOverview();

    ByteString getOverviewBytes();

    Page getPages(int i10);

    int getPagesCount();

    List<Page> getPagesList();

    DocumentationRule getRules(int i10);

    int getRulesCount();

    List<DocumentationRule> getRulesList();

    String getSummary();

    ByteString getSummaryBytes();
}
