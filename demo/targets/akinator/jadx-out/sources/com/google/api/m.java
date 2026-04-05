package com.google.api;

import com.google.api.Distribution;
import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class m extends GeneratedMessageLite.Builder implements p {
    public m addAllBucketCounts(Iterable<? extends Long> iterable) {
        copyOnWrite();
        ((Distribution) this.instance).addAllBucketCounts(iterable);
        return this;
    }

    public m addAllExemplars(Iterable<? extends Distribution.Exemplar> iterable) {
        copyOnWrite();
        ((Distribution) this.instance).addAllExemplars(iterable);
        return this;
    }

    public m addBucketCounts(long j10) {
        copyOnWrite();
        ((Distribution) this.instance).addBucketCounts(j10);
        return this;
    }

    public m addExemplars(Distribution.Exemplar exemplar) {
        copyOnWrite();
        ((Distribution) this.instance).addExemplars(exemplar);
        return this;
    }

    public m clearBucketCounts() {
        copyOnWrite();
        ((Distribution) this.instance).clearBucketCounts();
        return this;
    }

    public m clearBucketOptions() {
        copyOnWrite();
        ((Distribution) this.instance).clearBucketOptions();
        return this;
    }

    public m clearCount() {
        copyOnWrite();
        ((Distribution) this.instance).clearCount();
        return this;
    }

    public m clearExemplars() {
        copyOnWrite();
        ((Distribution) this.instance).clearExemplars();
        return this;
    }

    public m clearMean() {
        copyOnWrite();
        ((Distribution) this.instance).clearMean();
        return this;
    }

    public m clearRange() {
        copyOnWrite();
        ((Distribution) this.instance).clearRange();
        return this;
    }

    public m clearSumOfSquaredDeviation() {
        copyOnWrite();
        ((Distribution) this.instance).clearSumOfSquaredDeviation();
        return this;
    }

    @Override // com.google.api.p
    public long getBucketCounts(int i10) {
        return ((Distribution) this.instance).getBucketCounts(i10);
    }

    @Override // com.google.api.p
    public int getBucketCountsCount() {
        return ((Distribution) this.instance).getBucketCountsCount();
    }

    @Override // com.google.api.p
    public List<Long> getBucketCountsList() {
        return Collections.unmodifiableList(((Distribution) this.instance).getBucketCountsList());
    }

    @Override // com.google.api.p
    public Distribution.BucketOptions getBucketOptions() {
        return ((Distribution) this.instance).getBucketOptions();
    }

    @Override // com.google.api.p
    public long getCount() {
        return ((Distribution) this.instance).getCount();
    }

    @Override // com.google.api.p
    public Distribution.Exemplar getExemplars(int i10) {
        return ((Distribution) this.instance).getExemplars(i10);
    }

    @Override // com.google.api.p
    public int getExemplarsCount() {
        return ((Distribution) this.instance).getExemplarsCount();
    }

    @Override // com.google.api.p
    public List<Distribution.Exemplar> getExemplarsList() {
        return Collections.unmodifiableList(((Distribution) this.instance).getExemplarsList());
    }

    @Override // com.google.api.p
    public double getMean() {
        return ((Distribution) this.instance).getMean();
    }

    @Override // com.google.api.p
    public Distribution.Range getRange() {
        return ((Distribution) this.instance).getRange();
    }

    @Override // com.google.api.p
    public double getSumOfSquaredDeviation() {
        return ((Distribution) this.instance).getSumOfSquaredDeviation();
    }

    @Override // com.google.api.p
    public boolean hasBucketOptions() {
        return ((Distribution) this.instance).hasBucketOptions();
    }

    @Override // com.google.api.p
    public boolean hasRange() {
        return ((Distribution) this.instance).hasRange();
    }

    public m mergeBucketOptions(Distribution.BucketOptions bucketOptions) {
        copyOnWrite();
        ((Distribution) this.instance).mergeBucketOptions(bucketOptions);
        return this;
    }

    public m mergeRange(Distribution.Range range) {
        copyOnWrite();
        ((Distribution) this.instance).mergeRange(range);
        return this;
    }

    public m removeExemplars(int i10) {
        copyOnWrite();
        ((Distribution) this.instance).removeExemplars(i10);
        return this;
    }

    public m setBucketCounts(int i10, long j10) {
        copyOnWrite();
        ((Distribution) this.instance).setBucketCounts(i10, j10);
        return this;
    }

    public m setBucketOptions(Distribution.BucketOptions bucketOptions) {
        copyOnWrite();
        ((Distribution) this.instance).setBucketOptions(bucketOptions);
        return this;
    }

    public m setCount(long j10) {
        copyOnWrite();
        ((Distribution) this.instance).setCount(j10);
        return this;
    }

    public m setExemplars(int i10, Distribution.Exemplar exemplar) {
        copyOnWrite();
        ((Distribution) this.instance).setExemplars(i10, exemplar);
        return this;
    }

    public m setMean(double d10) {
        copyOnWrite();
        ((Distribution) this.instance).setMean(d10);
        return this;
    }

    public m setRange(Distribution.Range range) {
        copyOnWrite();
        ((Distribution) this.instance).setRange(range);
        return this;
    }

    public m setSumOfSquaredDeviation(double d10) {
        copyOnWrite();
        ((Distribution) this.instance).setSumOfSquaredDeviation(d10);
        return this;
    }

    public m addExemplars(int i10, Distribution.Exemplar exemplar) {
        copyOnWrite();
        ((Distribution) this.instance).addExemplars(i10, exemplar);
        return this;
    }

    public m setBucketOptions(d dVar) {
        copyOnWrite();
        ((Distribution) this.instance).setBucketOptions((Distribution.BucketOptions) dVar.build());
        return this;
    }

    public m setExemplars(int i10, n nVar) {
        copyOnWrite();
        ((Distribution) this.instance).setExemplars(i10, (Distribution.Exemplar) nVar.build());
        return this;
    }

    public m setRange(o oVar) {
        copyOnWrite();
        ((Distribution) this.instance).setRange((Distribution.Range) oVar.build());
        return this;
    }

    public m addExemplars(n nVar) {
        copyOnWrite();
        ((Distribution) this.instance).addExemplars((Distribution.Exemplar) nVar.build());
        return this;
    }

    public m addExemplars(int i10, n nVar) {
        copyOnWrite();
        ((Distribution) this.instance).addExemplars(i10, (Distribution.Exemplar) nVar.build());
        return this;
    }
}
