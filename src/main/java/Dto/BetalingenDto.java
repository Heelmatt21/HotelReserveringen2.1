package Dto;

import java.util.Date;

public class BetalingenDto {

        private int betaling_id;
        private Date betalingDatum;
        private int bedrag;
        private String betalingsmethode;

        public BetalingenDto() {
            this.betaling_id = betaling_id;
            this.betalingDatum = betalingDatum;
            this.bedrag = bedrag;
            this.betalingsmethode = betalingsmethode;
        }

        public int getbetaling_id() {
            return betaling_id;
        }

        public void setBetaling_id(int betaling_id) {
            this.betaling_id = betaling_id;
        }

        public Date getBetalingDatum() {
            return betalingDatum;
        }

        public void setBetalingDatum(Date betalingDatum) {
            this.betalingDatum = betalingDatum;
        }

        public int getBedrag() {
            return bedrag;
        }

        public void setBedrag(int bedrag) {
            this.bedrag = bedrag;
        }

        public String getBetalingsmethode() {
            return betalingsmethode;
        }

        public void setBetalingsmethode(String betalingsmethode) {
            this.betalingsmethode = betalingsmethode;
        }
    }

