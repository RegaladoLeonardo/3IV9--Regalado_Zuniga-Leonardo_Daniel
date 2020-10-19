
interface Response {
    page: number;
    per_page: number;
    total: number;
    total_pages: number;
    data: Data[];
    ad: Ad;
  }

interface Ad {
    company: string;
    url: string;
    text: string;
}

interface Data {
    id: number;
    email: string;
    first_name: string;
    last_name: string;
    avatar: string;
}

interface ResponseSingle {
  data: Data;
  ad: Ad;
}

export {
    Response,
    Ad,
    Data,
    ResponseSingle
};

