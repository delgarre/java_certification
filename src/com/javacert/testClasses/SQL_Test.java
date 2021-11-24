package com.javacert.testClasses;

public class SQL_Test {
    public static void main(String[] args) {
          final String SQL_ASSETS_SCAN_DATE_RANGE =
                new StringBuilder().append("select distinct id from ims_assets ")
                        .append("where parent_asset_container_id = ? and id not in (")
                        .append("    select distinct asset.id from ims_assets asset ")
                        .append("     join assets_rfid_scans scan on asset.id = scan.scanned_rfid_tag_asset_id ")
                        .append("    where ")
                        .append("     asset.parent_asset_container_id = ? ")
                        .append("     and scan.scan_date >=  CONVERT(DATETIME, CONVERT(DATE, CURRENT_TIMESTAMP)) + '?")
                        .append(":")
                        .append("00'")
                        .append("    group by asset.id ").append(")").toString();
          System.out.println(SQL_ASSETS_SCAN_DATE_RANGE);
    }

}
