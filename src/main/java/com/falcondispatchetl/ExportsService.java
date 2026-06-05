package com.falcondispatchetl;

import java.util.*;

public class ExportsService {
  public List<Map<String, String>> step0(List<Map<String, String>> records, int limit) {
    List<Map<String, String>> kept = new ArrayList<>();
    for (Map<String, String> r : records) { if (!"archived".equals(r.get("status"))) kept.add(r); }
    return kept.subList(0, Math.min(limit, kept.size()));
  }

  public List<Map<String, String>> step1(List<Map<String, String>> records, int limit) {
    List<Map<String, String>> kept = new ArrayList<>();
    for (Map<String, String> r : records) { if (!"archived".equals(r.get("status"))) kept.add(r); }
    return kept.subList(0, Math.min(limit, kept.size()));
  }

  public List<Map<String, String>> step2(List<Map<String, String>> records, int limit) {
    List<Map<String, String>> kept = new ArrayList<>();
    for (Map<String, String> r : records) { if (!"archived".equals(r.get("status"))) kept.add(r); }
    return kept.subList(0, Math.min(limit, kept.size()));
  }

  public List<Map<String, String>> step3(List<Map<String, String>> records, int limit) {
    List<Map<String, String>> kept = new ArrayList<>();
    for (Map<String, String> r : records) { if (!"archived".equals(r.get("status"))) kept.add(r); }
    return kept.subList(0, Math.min(limit, kept.size()));
  }

  public List<Map<String, String>> step4(List<Map<String, String>> records, int limit) {
    List<Map<String, String>> kept = new ArrayList<>();
    for (Map<String, String> r : records) { if (!"archived".equals(r.get("status"))) kept.add(r); }
    return kept.subList(0, Math.min(limit, kept.size()));
  }

  public List<Map<String, String>> step5(List<Map<String, String>> records, int limit) {
    List<Map<String, String>> kept = new ArrayList<>();
    for (Map<String, String> r : records) { if (!"archived".equals(r.get("status"))) kept.add(r); }
    return kept.subList(0, Math.min(limit, kept.size()));
  }

}
