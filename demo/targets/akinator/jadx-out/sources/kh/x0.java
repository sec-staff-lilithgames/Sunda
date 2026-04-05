package kh;

import com.google.api.Documentation;
import com.google.api.DocumentationRule;
import com.google.api.Page;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class x0 extends GeneratedMessageLite.Builder implements y0 {
    public x0 addAllPages(Iterable<? extends Page> iterable) {
        copyOnWrite();
        ((Documentation) this.instance).addAllPages(iterable);
        return this;
    }

    public x0 addAllRules(Iterable<? extends DocumentationRule> iterable) {
        copyOnWrite();
        ((Documentation) this.instance).addAllRules(iterable);
        return this;
    }

    public x0 addPages(Page page) {
        copyOnWrite();
        ((Documentation) this.instance).addPages(page);
        return this;
    }

    public x0 addRules(DocumentationRule documentationRule) {
        copyOnWrite();
        ((Documentation) this.instance).addRules(documentationRule);
        return this;
    }

    public x0 clearDocumentationRootUrl() {
        copyOnWrite();
        ((Documentation) this.instance).clearDocumentationRootUrl();
        return this;
    }

    public x0 clearOverview() {
        copyOnWrite();
        ((Documentation) this.instance).clearOverview();
        return this;
    }

    public x0 clearPages() {
        copyOnWrite();
        ((Documentation) this.instance).clearPages();
        return this;
    }

    public x0 clearRules() {
        copyOnWrite();
        ((Documentation) this.instance).clearRules();
        return this;
    }

    public x0 clearSummary() {
        copyOnWrite();
        ((Documentation) this.instance).clearSummary();
        return this;
    }

    @Override // kh.y0
    public String getDocumentationRootUrl() {
        return ((Documentation) this.instance).getDocumentationRootUrl();
    }

    @Override // kh.y0
    public ByteString getDocumentationRootUrlBytes() {
        return ((Documentation) this.instance).getDocumentationRootUrlBytes();
    }

    @Override // kh.y0
    public String getOverview() {
        return ((Documentation) this.instance).getOverview();
    }

    @Override // kh.y0
    public ByteString getOverviewBytes() {
        return ((Documentation) this.instance).getOverviewBytes();
    }

    @Override // kh.y0
    public Page getPages(int i10) {
        return ((Documentation) this.instance).getPages(i10);
    }

    @Override // kh.y0
    public int getPagesCount() {
        return ((Documentation) this.instance).getPagesCount();
    }

    @Override // kh.y0
    public List<Page> getPagesList() {
        return Collections.unmodifiableList(((Documentation) this.instance).getPagesList());
    }

    @Override // kh.y0
    public DocumentationRule getRules(int i10) {
        return ((Documentation) this.instance).getRules(i10);
    }

    @Override // kh.y0
    public int getRulesCount() {
        return ((Documentation) this.instance).getRulesCount();
    }

    @Override // kh.y0
    public List<DocumentationRule> getRulesList() {
        return Collections.unmodifiableList(((Documentation) this.instance).getRulesList());
    }

    @Override // kh.y0
    public String getSummary() {
        return ((Documentation) this.instance).getSummary();
    }

    @Override // kh.y0
    public ByteString getSummaryBytes() {
        return ((Documentation) this.instance).getSummaryBytes();
    }

    public x0 removePages(int i10) {
        copyOnWrite();
        ((Documentation) this.instance).removePages(i10);
        return this;
    }

    public x0 removeRules(int i10) {
        copyOnWrite();
        ((Documentation) this.instance).removeRules(i10);
        return this;
    }

    public x0 setDocumentationRootUrl(String str) {
        copyOnWrite();
        ((Documentation) this.instance).setDocumentationRootUrl(str);
        return this;
    }

    public x0 setDocumentationRootUrlBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Documentation) this.instance).setDocumentationRootUrlBytes(byteString);
        return this;
    }

    public x0 setOverview(String str) {
        copyOnWrite();
        ((Documentation) this.instance).setOverview(str);
        return this;
    }

    public x0 setOverviewBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Documentation) this.instance).setOverviewBytes(byteString);
        return this;
    }

    public x0 setPages(int i10, Page page) {
        copyOnWrite();
        ((Documentation) this.instance).setPages(i10, page);
        return this;
    }

    public x0 setRules(int i10, DocumentationRule documentationRule) {
        copyOnWrite();
        ((Documentation) this.instance).setRules(i10, documentationRule);
        return this;
    }

    public x0 setSummary(String str) {
        copyOnWrite();
        ((Documentation) this.instance).setSummary(str);
        return this;
    }

    public x0 setSummaryBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Documentation) this.instance).setSummaryBytes(byteString);
        return this;
    }

    public x0 addPages(int i10, Page page) {
        copyOnWrite();
        ((Documentation) this.instance).addPages(i10, page);
        return this;
    }

    public x0 addRules(int i10, DocumentationRule documentationRule) {
        copyOnWrite();
        ((Documentation) this.instance).addRules(i10, documentationRule);
        return this;
    }

    public x0 setPages(int i10, o3 o3Var) {
        copyOnWrite();
        ((Documentation) this.instance).setPages(i10, (Page) o3Var.build());
        return this;
    }

    public x0 setRules(int i10, a1 a1Var) {
        copyOnWrite();
        ((Documentation) this.instance).setRules(i10, (DocumentationRule) a1Var.build());
        return this;
    }

    public x0 addPages(o3 o3Var) {
        copyOnWrite();
        ((Documentation) this.instance).addPages((Page) o3Var.build());
        return this;
    }

    public x0 addRules(a1 a1Var) {
        copyOnWrite();
        ((Documentation) this.instance).addRules((DocumentationRule) a1Var.build());
        return this;
    }

    public x0 addPages(int i10, o3 o3Var) {
        copyOnWrite();
        ((Documentation) this.instance).addPages(i10, (Page) o3Var.build());
        return this;
    }

    public x0 addRules(int i10, a1 a1Var) {
        copyOnWrite();
        ((Documentation) this.instance).addRules(i10, (DocumentationRule) a1Var.build());
        return this;
    }
}
