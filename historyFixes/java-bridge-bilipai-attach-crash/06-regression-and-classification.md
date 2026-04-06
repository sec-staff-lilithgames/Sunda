# 06 Regression And Classification

## Conclusion

Current maintained baseline is green.
Historical hotter-pressure branch is still open and is intentionally classified separately.

## Current Green Baseline

Passing now:

- reduced reproducer
- tracked attach baseline
- attach smoke
- spawn smoke

Evidence:

- `artifacts/current-regression-summary.json`

## Historical Branch Classification

Historical hotter-pressure attach profile:

- status:
  - still-open
- symptom:
  - `python::attach::bridge-operation-error::pid-lost`
  - `script has been destroyed`
- archive:
  - `artifacts/historical-hot-attach-failure-summary.txt`

## Interpretation

- Current maintained baseline:
  - fixed-current-baseline
- Historical hotter-pressure branch:
  - not closed
  - preserved for future work

## Explanation

This split is deliberate:

- green maintained cases gate daily regression
- hotter historical case remains an audit and future investigation branch
- the two must not be conflated in status reporting
