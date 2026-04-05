package wv;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Timestamp;
import java.util.Collections;
import java.util.List;
import metric.Metric$Event;
import metric.Metric$UserMetric;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class g extends GeneratedMessageLite.Builder implements h {
    public g addAllEvents(Iterable<? extends Metric$Event> iterable) {
        copyOnWrite();
        ((Metric$UserMetric) this.instance).addAllEvents(iterable);
        return this;
    }

    public g addEvents(Metric$Event metric$Event) {
        copyOnWrite();
        ((Metric$UserMetric) this.instance).addEvents(metric$Event);
        return this;
    }

    public g clearAppKey() {
        copyOnWrite();
        ((Metric$UserMetric) this.instance).clearAppKey();
        return this;
    }

    public g clearCmpHash() {
        copyOnWrite();
        ((Metric$UserMetric) this.instance).clearCmpHash();
        return this;
    }

    public g clearEvents() {
        copyOnWrite();
        ((Metric$UserMetric) this.instance).clearEvents();
        return this;
    }

    public g clearIp() {
        copyOnWrite();
        ((Metric$UserMetric) this.instance).clearIp();
        return this;
    }

    public g clearOrigin() {
        copyOnWrite();
        ((Metric$UserMetric) this.instance).clearOrigin();
        return this;
    }

    public g clearSavedAt() {
        copyOnWrite();
        ((Metric$UserMetric) this.instance).clearSavedAt();
        return this;
    }

    public g clearTruncatedIp() {
        copyOnWrite();
        ((Metric$UserMetric) this.instance).clearTruncatedIp();
        return this;
    }

    public g clearUserAgent() {
        copyOnWrite();
        ((Metric$UserMetric) this.instance).clearUserAgent();
        return this;
    }

    public g clearUuid() {
        copyOnWrite();
        ((Metric$UserMetric) this.instance).clearUuid();
        return this;
    }

    public g clearUuidHash() {
        copyOnWrite();
        ((Metric$UserMetric) this.instance).clearUuidHash();
        return this;
    }

    @Override // wv.h
    public String getAppKey() {
        return ((Metric$UserMetric) this.instance).getAppKey();
    }

    @Override // wv.h
    public ByteString getAppKeyBytes() {
        return ((Metric$UserMetric) this.instance).getAppKeyBytes();
    }

    @Override // wv.h
    public String getCmpHash() {
        return ((Metric$UserMetric) this.instance).getCmpHash();
    }

    @Override // wv.h
    public ByteString getCmpHashBytes() {
        return ((Metric$UserMetric) this.instance).getCmpHashBytes();
    }

    @Override // wv.h
    public Metric$Event getEvents(int i10) {
        return ((Metric$UserMetric) this.instance).getEvents(i10);
    }

    @Override // wv.h
    public int getEventsCount() {
        return ((Metric$UserMetric) this.instance).getEventsCount();
    }

    @Override // wv.h
    public List<Metric$Event> getEventsList() {
        return Collections.unmodifiableList(((Metric$UserMetric) this.instance).getEventsList());
    }

    @Override // wv.h
    public String getIp() {
        return ((Metric$UserMetric) this.instance).getIp();
    }

    @Override // wv.h
    public ByteString getIpBytes() {
        return ((Metric$UserMetric) this.instance).getIpBytes();
    }

    @Override // wv.h
    public String getOrigin() {
        return ((Metric$UserMetric) this.instance).getOrigin();
    }

    @Override // wv.h
    public ByteString getOriginBytes() {
        return ((Metric$UserMetric) this.instance).getOriginBytes();
    }

    @Override // wv.h
    public Timestamp getSavedAt() {
        return ((Metric$UserMetric) this.instance).getSavedAt();
    }

    @Override // wv.h
    public String getTruncatedIp() {
        return ((Metric$UserMetric) this.instance).getTruncatedIp();
    }

    @Override // wv.h
    public ByteString getTruncatedIpBytes() {
        return ((Metric$UserMetric) this.instance).getTruncatedIpBytes();
    }

    @Override // wv.h
    public String getUserAgent() {
        return ((Metric$UserMetric) this.instance).getUserAgent();
    }

    @Override // wv.h
    public ByteString getUserAgentBytes() {
        return ((Metric$UserMetric) this.instance).getUserAgentBytes();
    }

    @Override // wv.h
    public String getUuid() {
        return ((Metric$UserMetric) this.instance).getUuid();
    }

    @Override // wv.h
    public ByteString getUuidBytes() {
        return ((Metric$UserMetric) this.instance).getUuidBytes();
    }

    @Override // wv.h
    public String getUuidHash() {
        return ((Metric$UserMetric) this.instance).getUuidHash();
    }

    @Override // wv.h
    public ByteString getUuidHashBytes() {
        return ((Metric$UserMetric) this.instance).getUuidHashBytes();
    }

    @Override // wv.h
    public boolean hasSavedAt() {
        return ((Metric$UserMetric) this.instance).hasSavedAt();
    }

    public g mergeSavedAt(Timestamp timestamp) {
        copyOnWrite();
        ((Metric$UserMetric) this.instance).mergeSavedAt(timestamp);
        return this;
    }

    public g removeEvents(int i10) {
        copyOnWrite();
        ((Metric$UserMetric) this.instance).removeEvents(i10);
        return this;
    }

    public g setAppKey(String str) {
        copyOnWrite();
        ((Metric$UserMetric) this.instance).setAppKey(str);
        return this;
    }

    public g setAppKeyBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Metric$UserMetric) this.instance).setAppKeyBytes(byteString);
        return this;
    }

    public g setCmpHash(String str) {
        copyOnWrite();
        ((Metric$UserMetric) this.instance).setCmpHash(str);
        return this;
    }

    public g setCmpHashBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Metric$UserMetric) this.instance).setCmpHashBytes(byteString);
        return this;
    }

    public g setEvents(int i10, Metric$Event metric$Event) {
        copyOnWrite();
        ((Metric$UserMetric) this.instance).setEvents(i10, metric$Event);
        return this;
    }

    public g setIp(String str) {
        copyOnWrite();
        ((Metric$UserMetric) this.instance).setIp(str);
        return this;
    }

    public g setIpBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Metric$UserMetric) this.instance).setIpBytes(byteString);
        return this;
    }

    public g setOrigin(String str) {
        copyOnWrite();
        ((Metric$UserMetric) this.instance).setOrigin(str);
        return this;
    }

    public g setOriginBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Metric$UserMetric) this.instance).setOriginBytes(byteString);
        return this;
    }

    public g setSavedAt(Timestamp timestamp) {
        copyOnWrite();
        ((Metric$UserMetric) this.instance).setSavedAt(timestamp);
        return this;
    }

    public g setTruncatedIp(String str) {
        copyOnWrite();
        ((Metric$UserMetric) this.instance).setTruncatedIp(str);
        return this;
    }

    public g setTruncatedIpBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Metric$UserMetric) this.instance).setTruncatedIpBytes(byteString);
        return this;
    }

    public g setUserAgent(String str) {
        copyOnWrite();
        ((Metric$UserMetric) this.instance).setUserAgent(str);
        return this;
    }

    public g setUserAgentBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Metric$UserMetric) this.instance).setUserAgentBytes(byteString);
        return this;
    }

    public g setUuid(String str) {
        copyOnWrite();
        ((Metric$UserMetric) this.instance).setUuid(str);
        return this;
    }

    public g setUuidBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Metric$UserMetric) this.instance).setUuidBytes(byteString);
        return this;
    }

    public g setUuidHash(String str) {
        copyOnWrite();
        ((Metric$UserMetric) this.instance).setUuidHash(str);
        return this;
    }

    public g setUuidHashBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Metric$UserMetric) this.instance).setUuidHashBytes(byteString);
        return this;
    }

    public g addEvents(int i10, Metric$Event metric$Event) {
        copyOnWrite();
        ((Metric$UserMetric) this.instance).addEvents(i10, metric$Event);
        return this;
    }

    public g setEvents(int i10, b bVar) {
        copyOnWrite();
        ((Metric$UserMetric) this.instance).setEvents(i10, (Metric$Event) bVar.build());
        return this;
    }

    public g setSavedAt(Timestamp.Builder builder) {
        copyOnWrite();
        ((Metric$UserMetric) this.instance).setSavedAt(builder.build());
        return this;
    }

    public g addEvents(b bVar) {
        copyOnWrite();
        ((Metric$UserMetric) this.instance).addEvents((Metric$Event) bVar.build());
        return this;
    }

    public g addEvents(int i10, b bVar) {
        copyOnWrite();
        ((Metric$UserMetric) this.instance).addEvents(i10, (Metric$Event) bVar.build());
        return this;
    }
}
